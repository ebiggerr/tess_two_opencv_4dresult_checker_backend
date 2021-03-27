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

package com.ebiggerr.tess_two_opencv_4dresult_checker_backend.repository;

import com.ebiggerr.tess_two_opencv_4dresult_checker_backend.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface resultRepo extends JpaRepository<Result, String> {

    @Query( value="SELECT id,drawingdate,gametype,firstprize,secondprize,thirdprize,starterprize,consolationprize,drawingservice FROM public.\"history4D\" WHERE drawingdate=?1 AND drawingservice=?2 AND gametype=?3", nativeQuery=true)
    Result findResultByDateAndDrawingServiceAndGameType(LocalDate date, String drawingService, String gameType);

}
