package com.xingcheng;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author XingCheng
 * @date 12.06.2019
 */
@WebService(serviceName = "BeautyProductService")
public class BeautyProductWebService {
    @Resource(lookup = "jdbc/mvideo")
    private DataSource dataSource;

    @WebMethod(operationName = "findBeautyProducts")
    public List<BeautyProduct> findBeautyProducts() {
        PostgreSqlDao dao = new PostgreSqlDao(getConn());
        return dao.findAllBeautyProducts();
    }

    @WebMethod(operationName = "findBeautyProduct")
    public List<BeautyProduct> findBeautyProduct(String id, String name, String producingСountry, String vendorСode, String category, String price) {
        PostgreSqlDao dao = new PostgreSqlDao(getConn());
        return dao.findBeautyProduct(id, name, producingСountry, vendorСode, category, price);
    }

    private Connection getConn() {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        }
        catch (SQLException ex) {
            Logger.getLogger(BeautyProductWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
