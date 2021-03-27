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

package com.ebiggerr.tess_two_opencv_4dresult_checker_backend.service.helperService;

import com.ebiggerr.tess_two_opencv_4dresult_checker_backend.entity.Result;
import com.ebiggerr.tess_two_opencv_4dresult_checker_backend.service.resultService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DatabaseCheck {

    private resultService resultService;

    public int checkTuesdaySpecialDrawing(LocalDate checkingDate,String drawingService,String gameType ){

        Result result= resultService.loadResult(checkingDate,drawingService,gameType);

        if( result != null){
            return 1;
        }
        return 0;
    }
}
