package com.jim.mybatis.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jim on 2017/9/24.
 * This class is ...
 */
public class CommaSplitTypeHandler implements TypeHandler {
	@Override
	public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {

	}

	@Override
	public Object getResult(ResultSet resultSet, String s) throws SQLException {
		String result = resultSet.getString(s);
		return result.split(",");
	}

	@Override
	public Object getResult(ResultSet resultSet, int i) throws SQLException {
		return null;
	}

	@Override
	public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
		return null;
	}
}
