package com.mybatis.demo.controller;

import com.mybatis.demo.enums.ReportEnum;
import com.mybatis.demo.exception.ReportException;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * @author：linma
 * @date: 2018/11/8 11:14
 * @email: linma@homeinns.com
 **/
@RestController
public abstract class AbstractController {

    /**
     * pdf报表展示方法
     *
     * @param dataSources 报表展示数据
     * @param jrxmlPath 模板文件路径
     * @param response 服务端相应类
     * @throws IOException
     * @throws JRException
     */
    protected void exportPDFReport(List<Map<String, Object>> dataSources, String jrxmlPath,
                                   HttpServletResponse response)
            throws IOException, JRException {
        if (dataSources == null || dataSources.size() == 0) {
            throw new ReportException(ReportEnum.REPORT_DATA_NOT_NULL);
        }
        // 加载数据到报表类
        List<Map<String, Object>> data = dataSources;
        JRDataSource dataSource = new JRBeanCollectionDataSource(data);
        // 获取报表模板jrxml
        if (StringUtils.isEmpty(jrxmlPath)) {
            throw new ReportException(ReportEnum.JRXML_FILE_NOT_ALLOWED_NULL);
        }
        URL url = getClass().getClassLoader().getResource(jrxmlPath);
        if (url == null) {
            throw new ReportException(ReportEnum.JRXML_PATH_NOT_FOUND);
        }
        String path = url.getPath();
        File jrxmlFile = new File(path);
        // 加载报表
        InputStream input = new FileInputStream(jrxmlFile);
        JasperReport jasperReport = JasperCompileManager.compileReport(input);
        // 打印报表
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);
        // 输出报表
        JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
        // 最后流一定要刷新和关闭
        response.getOutputStream().flush();
        response.getOutputStream().close();
        input.close();
    }
}
