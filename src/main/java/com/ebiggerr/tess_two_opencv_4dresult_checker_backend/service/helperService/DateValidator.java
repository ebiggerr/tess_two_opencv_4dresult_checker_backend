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
import com.ebiggerr.tess_two_opencv_4dresult_checker_backend.repository.resultRepo;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class DateValidator {

    private final resultRepo resultRepo;

    public DateValidator(resultRepo resultRepo) {
        this.resultRepo = resultRepo;
    }


    /*
    *   getCorrectDate()
    *   The idea behind of method is to get the correct date to compare with the database.
    *   Since the drawing_date is only on Wednesday,Saturday,Sunday and certain Tuesday for special drawing
    *
    *   Let's say that the date scanned from ticket using the frontend application is Monday, then is should compare its result with result from coming
    *   Wednesday ( if the result has already came out, else return a null result, which will be handled by other service of the application, change the
    *   null to a error message prompt to frontend telling user that the result is not yet announced. )
    *
    *   Monday - coming Wednesday ( or coming Tuesday if special drawing is going to happen)
    *   Tuesday - (if have special drawing, return the result ; else , compare with the result of coming Wednesday
    *   Wednesday - Wednesday
    *   Thursday,Friday - compare with result of coming Saturday
    *   Saturday - Saturday
    *   Sunday - Sunday
    *
    *
    * */

    /**
     *  @param
     *  @return
     *
     *  @author
     * */
    public LocalDate getCorrectDate(LocalDate userScanned_Drawing_Date, String drawingService, String gameType){

        Result result=new Result();

        DayOfWeek day=userScanned_Drawing_Date.getDayOfWeek();

        int status=0;

        switch ( day ){

            //days with draw opening
            case SUNDAY :
            case SATURDAY :
            case WEDNESDAY :
                    return userScanned_Drawing_Date;

            case MONDAY: result= resultRepo.findResultByDateAndDrawingServiceAndGameType(userScanned_Drawing_Date.plusDays(1),drawingService,gameType);
                                if( result != null ){
                                    return userScanned_Drawing_Date.plusDays(1);
                                }
                                else if( result == null ){
                                    return userScanned_Drawing_Date.plusDays(2);
                                }

            case TUESDAY :  result= resultRepo.findResultByDateAndDrawingServiceAndGameType(userScanned_Drawing_Date,drawingService,gameType);
                                if( result != null ){
                                    return userScanned_Drawing_Date;
                                }
                                else if( result == null ){
                                    return userScanned_Drawing_Date.plusDays(1);
                                }

            case THURSDAY : return userScanned_Drawing_Date.plusDays(2);
            case FRIDAY : return userScanned_Drawing_Date.plusDays(1);

        }

        return userScanned_Drawing_Date;
    }
}
