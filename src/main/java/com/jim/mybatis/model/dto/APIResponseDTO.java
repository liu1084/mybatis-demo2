package com.jim.mybatis.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;


/**
 * API调用的返回类
 * TODO:如果是抛出非检查型的运行时异常的话，需要使用拦截器来统一处理
 */
@JsonInclude(NON_NULL)
public class APIResponseDTO {
	public static final Integer RESPONSE_OK_CODE = 200;
	public static final Integer RESPONSE_ERR_CODE = 500;
	public static final Integer RESPONSE_EXCEPTION_CODE = 600;
	Object result;
	String time;
	Long code;

	public static APIResponseDTO toOkResponse(final Object data) {
		return toAPIResponseDTO(data, RESPONSE_OK_CODE);
	}

	public static APIResponseDTO toErrorResponse(final Object data) {
		return toAPIResponseDTO(data, RESPONSE_ERR_CODE);
	}

	public static ExceptionAPIResponseDTO toExceptionResponse(final String result,
														   final Object details) {
		final ExceptionAPIResponseDTO response = new ExceptionAPIResponseDTO();
		response.setResult(result);
		response.setDetails(details);
		response.setCode(RESPONSE_EXCEPTION_CODE);
		return response;
	}

	public static APIResponseDTO toAPIResponseDTO(final Object data, final long code) {
		final APIResponseDTO response = new APIResponseDTO();
		response.setResult(data);
		response.setCode(code);
		return response;
	}

	public void setCode(final Long code) {
		this.code = code;
	}

	public Object getResult() {
		return this.result;
	}

	public void setResult(final Object result) {
		this.result = result;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(final String time) {
		this.time = time;
	}

	public long getCode() {
		return this.code;
	}

	public void setCode(final long code) {
		this.code = code;
	}

	public static class ExceptionAPIResponseDTO extends APIResponseDTO {
		Object details;

		public Object getDetails() {
			return this.details;
		}

		public void setDetails(final Object details) {
			this.details = details;
		}
	}
}
