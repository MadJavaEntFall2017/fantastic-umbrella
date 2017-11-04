drop database if exists fantastic_umbrella_test;
create database fantastic_umbrella_test;

use fantastic_umbrella_test;
drop table if exists people;
create table people (
	id int(11) not null auto_increment,
	gender varchar(20),
	name varchar(50),
	description varchar(1000),
	image_url varchar(60),
	primary key (id)
);

insert into people (id, gender, name, description, image_url) values (1, 'Female', 'Georgianna Local', 'evolve back-end architectures', 'https://robohash.org/officiisnecessitatibusaliquam.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (2, 'Male', 'Romona Wyllie', 'empower distributed functionalities', 'https://robohash.org/quasconsecteturdolorem.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (3, 'Male', 'Natassia Filan', 'repurpose sexy e-commerce', 'https://robohash.org/enimodiototam.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (4, 'Female', 'Kory Whelan', 'deliver user-centric e-markets', 'https://robohash.org/evenietmolestiaeut.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (5, 'Female', 'Killian Brayford', 'aggregate value-added ROI', 'https://robohash.org/repellatetdolorem.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (6, 'Female', 'Odella Rolls', 'e-enable 24/365 interfaces', 'https://robohash.org/etquiet.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (7, 'Female', 'Llywellyn Eydel', 'integrate holistic e-markets', 'https://robohash.org/minimaeiuslaboriosam.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (8, 'Female', 'Rora Letham', 'synthesize dynamic supply-chains', 'https://robohash.org/voluptatibusestatque.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (9, 'Female', 'Carrissa Christensen', 'seize 24/7 platforms', 'https://robohash.org/doloribussolutaneque.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (10, 'Female', 'Kat Sive', 'deploy collaborative portals', 'https://robohash.org/atlaboriosampariatur.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (11, 'Male', 'Clare Clapson', 'embrace revolutionary initiatives', 'https://robohash.org/utaccusamusneque.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (12, 'Male', 'Terese Scotter', 'mesh efficient content', 'https://robohash.org/molestiasnequeillum.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (13, 'Female', 'Malinde Collinson', 'maximize open-source channels', 'https://robohash.org/minuserrortempora.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (14, 'Female', 'Ximenez McKie', 'deploy wireless relationships', 'https://robohash.org/enimexpeditaest.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (15, 'Male', 'Kitti Reany', 'transform sticky technologies', 'https://robohash.org/faceresuntest.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (16, 'Male', 'Tabby Jorry', 'drive open-source interfaces', 'https://robohash.org/utestlaudantium.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (17, 'Female', 'Frederique Tern', 'extend revolutionary applications', 'https://robohash.org/utetex.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (18, 'Female', 'Amandy Dumberrill', 'disintermediate 24/365 schemas', 'https://robohash.org/doloribusvoluptasearum.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (19, 'Male', 'Vanny Creevy', 'facilitate granular metrics', 'https://robohash.org/cumqueverodolore.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (20, 'Female', 'Andrey Tennet', 'recontextualize value-added interfaces', 'https://robohash.org/uttemporeodio.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (21, 'Male', 'Augustina Cookes', 'engineer collaborative relationships', 'https://robohash.org/namsitconsequatur.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (22, 'Male', 'Dian Perkins', 'reintermediate frictionless ROI', 'https://robohash.org/culparepellendusnihil.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (23, 'Female', 'Ethelyn Redpath', 'enable bricks-and-clicks eyeballs', 'https://robohash.org/doloremetlaborum.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (24, 'Male', 'Gwyneth Threlfall', 'harness 24/365 platforms', 'https://robohash.org/nostrummaioresid.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (25, 'Female', 'Clemence Oxtoby', 'mesh clicks-and-mortar e-commerce', 'https://robohash.org/estquaequi.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (26, 'Male', 'Bonnie Sunnex', 'enable next-generation content', 'https://robohash.org/voluptatesmaioresqui.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (27, 'Female', 'Alasdair Pearcy', 'iterate granular networks', 'https://robohash.org/dignissimosestnatus.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (28, 'Female', 'Reagan Stancliffe', 'grow 24/365 web services', 'https://robohash.org/doloribussequideleniti.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (29, 'Female', 'Dolley McMechan', 'redefine wireless models', 'https://robohash.org/cumaperiamut.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (30, 'Male', 'Danika Isaacson', 'scale 24/7 action-items', 'https://robohash.org/repellendusconsecteturipsa.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (31, 'Male', 'Melody Edworthy', 'mesh user-centric convergence', 'https://robohash.org/adrerumipsam.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (32, 'Female', 'Lek Sheere', 'unleash scalable portals', 'https://robohash.org/sintfugiatquam.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (33, 'Female', 'Brendin McNeely', 'leverage global vortals', 'https://robohash.org/errorutautem.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (34, 'Male', 'Lindy McCartney', 'target B2C networks', 'https://robohash.org/nihilillumerror.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (35, 'Male', 'Belicia Aickin', 'exploit user-centric deliverables', 'https://robohash.org/providentverovoluptas.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (36, 'Male', 'Rudiger Deakin', 'seize front-end solutions', 'https://robohash.org/solutaautest.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (37, 'Male', 'Bobbie Chomicz', 'syndicate sexy web-readiness', 'https://robohash.org/quisquamvelatque.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (38, 'Female', 'Tobit Slaymaker', 'mesh granular channels', 'https://robohash.org/reiciendisnequealias.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (39, 'Male', 'Alford Castille', 'engineer scalable relationships', 'https://robohash.org/atquaeexpedita.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (40, 'Female', 'Stan Kordovani', 'seize out-of-the-box methodologies', 'https://robohash.org/voluptasmagnamsimilique.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (41, 'Male', 'Laurena Spilisy', 'redefine sexy applications', 'https://robohash.org/nequerepellendusquo.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (42, 'Female', 'Honoria Barley', 'target revolutionary applications', 'https://robohash.org/temporaquineque.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (43, 'Female', 'Emmalyn Galton', 'e-enable user-centric supply-chains', 'https://robohash.org/assumendaetut.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (44, 'Male', 'Geri Djuricic', 'evolve B2B content', 'https://robohash.org/etquaealiquam.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (45, 'Male', 'Bryce Balk', 'benchmark killer eyeballs', 'https://robohash.org/autetaliquam.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (46, 'Female', 'Hyacinthia Spreag', 'matrix end-to-end systems', 'https://robohash.org/velitetvel.png?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (47, 'Male', 'Tressa Oldroyde', 'visualize impactful e-commerce', 'https://robohash.org/iurefugiatqui.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (48, 'Male', 'Claribel Heaney`', 'disintermediate rich web services', 'https://robohash.org/cupiditateenimet.jpg?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (49, 'Female', 'Kahaleel Seabright', 'enhance front-end functionalities', 'https://robohash.org/dictaquivelit.bmp?size=50x50&set=set1');
insert into people (id, gender, name, description, image_url) values (50, 'Male', 'Udall Stelfox', 'cultivate frictionless networks', 'https://robohash.org/atquoiste.bmp?size=50x50&set=set1');
drop user if exists 'fantastic_umbrella_test'@'localhost';
create user 'fantastic_umbrella_test'@'localhost' identified by 'fantastic_pass';
grant all on fantastic_umbrella_test.* to 'fantastic_umbrella_test'@'localhost';
flush privileges;