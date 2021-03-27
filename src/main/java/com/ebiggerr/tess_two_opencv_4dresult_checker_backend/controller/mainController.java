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

package com.ebiggerr.tess_two_opencv_4dresult_checker_backend.controller;

import com.ebiggerr.tess_two_opencv_4dresult_checker_backend.entity.API_Response;
import com.ebiggerr.tess_two_opencv_4dresult_checker_backend.entity.Result;
import com.ebiggerr.tess_two_opencv_4dresult_checker_backend.entity.resultRequest;
import com.ebiggerr.tess_two_opencv_4dresult_checker_backend.service.resultService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class mainController {

    private final resultService resultService;

    public mainController(resultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping(path = "/getDate")
    public API_Response getResultAccordingToDate(@RequestBody resultRequest request){

        Result result=resultService.loadResult(LocalDate.parse(request.getDate()),request.getDrawingService(),request.getGameType());

        if( result == null ){

            return new API_Response().NotFound();
        }

        return new API_Response().Success(result);
    }

}
