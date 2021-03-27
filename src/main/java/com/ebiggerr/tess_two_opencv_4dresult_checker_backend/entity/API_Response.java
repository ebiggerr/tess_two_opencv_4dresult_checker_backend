/*
 *  Copyright (C) 2020  Alexious Yong (Ebiggerr)
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ebiggerr.tess_two_opencv_4dresult_checker_backend.entity;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class API_Response implements Serializable {

    private HttpStatus httpStatus;
    private String message;
    private Object data;

    public API_Response() {

    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public API_Response Success(Object data){

        API_Response response=new API_Response();
        response.setHttpStatus(HttpStatus.OK);
        response.setMessage("Successful");
        response.setData(data);

        return response;

    }

    public API_Response Success(JWTToken token){

        API_Response response=new API_Response();
        response.setHttpStatus(HttpStatus.OK);
        response.setMessage("Successful.");
        response.setData(token);

        return response;
    }

    public API_Response NotFound() {

        API_Response response=new API_Response();
        response.setHttpStatus(HttpStatus.OK);
        response.setMessage("No Result Found.");
        response.setData(null);

        return response;
    }
}
