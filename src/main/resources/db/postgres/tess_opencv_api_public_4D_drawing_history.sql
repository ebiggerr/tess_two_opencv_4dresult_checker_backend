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


create table "history4D"
(
    id               varchar(20),
    drawingdate      date,
    gametype         varchar(20),
    firstprize       varchar(45),
    secondprize      varchar(45),
    thirdprize       varchar(45),
    drawingservice   varchar(10),
    starterprize     varchar(60),
    consolationprize varchar(60)
);

INSERT INTO history4D ( "id" , "consolationprize" ,"drawingdate", "firstprize", "secondprize", "drawingservice", "starterprize", "thirdprize", "gametype") VALUES (1, '1121-1122-1123-1124-1125-1126-1127-1128-1129-1130', '2020-10-13', '1000', '1100', 'TOTO', '1111-1112-1113-1114-1115-1116-1117-1118-1119-1120', '1110', '4D');
INSERT INTO history4D ( "id" , "consolationprize", "drawingdate", "firstprize", "secondprize", "drawingservice", "starterrize", "thirdprize", "gametype") VALUES (2, '2121-2122-2123-2124-2125-2126-2127-2128-2129-2130', '2020-10-13', '2000', '2100', 'MAGNUM', '2111-2112-2113-2114-2115-2116-2117-2118-2119-2120', '2110', '4D');
INSERT INTO history4D ( "id" , "consolationprize", "drawingdate", "firstprize", "secondprize", "drawingservice", "starterprize", "thirdprize", "gametype") VALUES (3, '3121-3122-3123-3124-3125-3126-3127-3128-3129-1130', '2020-10-13', '3000', '3100', 'DAMACAI', '3111-3112-3113-3114-3115-3116-3117-3118-3119-3120', '3110', '4D');

