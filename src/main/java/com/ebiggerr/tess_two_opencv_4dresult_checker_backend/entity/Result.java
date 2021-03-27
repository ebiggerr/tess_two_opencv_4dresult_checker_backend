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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table( name = "history4D")
public class Result {

    @Id
    @Column( name= "id")
    private String id;

    @Column( name= "drawingdate")
    private LocalDate drawingDate;

    @Column( name= "gametype")
    private String gameType;

    @Column( name= "firstprize")
    private String firstPrize;

    @Column( name= "secondprize")
    private String secondPrize;

    @Column( name= "thirdprize")
    private String thirdPrize;

    @Column( name= "starterprize")
    private String starterPrize;

    @Column( name= "consolationprize")
    private String consolationPrize;

    @Column( name= "drawingservice")
    private String drawingService;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDrawingDate() {
        return drawingDate;
    }

    public void setDrawingDate(LocalDate drawingDate) {
        this.drawingDate = drawingDate;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getFirstPrize() {
        return firstPrize;
    }

    public void setFirstPrize(String firstPrize) {
        this.firstPrize = firstPrize;
    }

    public String getSecondPrize() {
        return secondPrize;
    }

    public void setSecondPrize(String secondPrize) {
        this.secondPrize = secondPrize;
    }

    public String getThirdPrize() {
        return thirdPrize;
    }

    public void setThirdPrize(String thirdPrize) {
        this.thirdPrize = thirdPrize;
    }

    public String getStarterPrize() {
        return starterPrize;
    }

    public void setStarterPrize(String starterPrize) {
        this.starterPrize = starterPrize;
    }

    public String getConsolationPrize() {
        return consolationPrize;
    }

    public void setConsolationPrize(String consolationPrize) {
        this.consolationPrize = consolationPrize;
    }

    public String getDrawingService() {
        return drawingService;
    }

    public void setDrawingService(String drawingService) {
        this.drawingService = drawingService;
    }
}
