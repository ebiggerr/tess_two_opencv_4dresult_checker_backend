
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

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table(name="drawing_history")
public class lotteryResult {


    public lotteryResult() {

    }


    public lotteryResult(LocalDate drawing_date,String drawing_service,String game_type,String drawing_first_prize,String drawing_second_prize,String drawing_third_prize,String drawing_starter_prize,String drawing_consolation_prize){

        this.drawing_date=drawing_date;
        this.drawing_service=drawing_service;
        this.game_type=game_type;
        this.drawing_first_prize=drawing_first_prize;
        this.drawing_second_prize=drawing_second_prize;
        this.drawing_third_prize=drawing_third_prize;
        this.drawing_starter_prize=drawing_starter_prize;
        this.drawing_consolation_prize=drawing_consolation_prize;

    }

    @Id
    @Column(name="unique_result_id")
    @NonNull
    @Getter @Setter private String unique_result_id;

    @Column(name="drawing_date")
    @NonNull
    @Getter @Setter private LocalDate drawing_date;

    @Column(name="drawing_service")
    @NonNull
    @Getter @Setter private String drawing_service;

    @Column(name="drawing_first_prize")
    @NonNull
    @Getter @Setter private String drawing_first_prize;

    @Column(name="drawing_second_prize")
    @NonNull
    @Getter @Setter private String drawing_second_prize;

    @Column(name="drawing_third_prize")
    @NonNull
    @Getter @Setter private String drawing_third_prize;

    @Column(name="drawing_starter_prize")
    @NonNull
    @Getter @Setter private String drawing_starter_prize;

    @Column(name="drawing_consolation_prize")
    @NonNull
    @Getter @Setter private String drawing_consolation_prize;

    @Column(name="game_type")
    @NonNull
    @Getter @Setter private String game_type;

}
