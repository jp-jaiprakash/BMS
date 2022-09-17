INSERT INTO `movie` VALUES (1,'BAHUBALI'),(2,'RRR');

INSERT INTO `theatre` (theatreid, theatrename, city, pincode, area ) VALUES (1,'PVR','HYD','502319','KPHB'),(2,'AMB','HYD','502319','HITECHCITY');

INSERT INTO `screen` (screenid, screennum, capacity, theatreid) VALUES (1,1,300,1), (2,2,300,1), (3,1,250,2);

INSERT INTO `shows` (showid, theatreid, screenid, movieid , showtimings, showdate) VALUES (1,1,1,1,'10:00','16-SEP-2022'),(2,1,2,2,'11:00','16-SEP-2022'),(3,2,3,2,'13:00','16-SEP-2022');
