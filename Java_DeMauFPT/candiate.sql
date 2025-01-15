create database employee
use employee
create table candiate(
	CandiateID int identity(24000,1) primary key,
	HoTen nvarchar(50) not null,
	Birth Date null,
	DCThuongTru nvarchar(100) null,
	QueQuan nvarchar(100) null,
	Phone varchar(10) null,
	Email varchar(40) null,
	CONSTRAINT chk_PhoneNumber CHECK (Phone LIKE '%[0-9]%') 
);

create table ExperienceCandidate(
	CandiateID int primary key
	foreign key (CandiateID) references candiate(CandiateID)
	on update cascade
	on delete cascade,
	ExpYear float not null,
	Skill nvarchar(100) not null,
	LastCompany nvarchar(100) not null
);

create table FresherCandidate(
	CandiateID int primary key
	foreign key (CandiateID) references candiate(CandiateID)
	on update cascade
	on delete cascade,
	GraduateDate date not null,
	GraduateRank varchar(10) not null,
	GraduateSchool nvarchar(50) not null
);
create table InternCandidate(
	CandiateID int primary key
	foreign key (CandiateID) references candiate(CandiateID)
	on update cascade
	on delete cascade,
	Major nvarchar(100) not null,
	Term int not null,
	School nvarchar(100) not null,
	GraduateDate date not null,
);
drop proc addCandidate
create proc addCandidate
	@HoTen nvarchar(50),
	@Birth Date, 
	@DiaChiTT nvarchar(100), 
	@QueQuan nvarchar(100), 
	@phone nvarchar(10), 
	@email nvarchar(40)
AS
BEGIN
	insert into candiate(HoTen , Birth, DCThuongTru, QueQuan, Phone, Email)
	values(@HoTen , @Birth,@DiaChiTT, @QueQuan, @phone, @email)
END;

create proc addExpCandidate
	@HoTen nvarchar(50),
	@Birth Date, 
	@DiaChiTT nvarchar(100), 
	@QueQuan nvarchar(100), 
	@phone nvarchar(10), 
	@email nvarchar(40),
	@ExpYear float,
	@Skill nvarchar(10), 
	@LastPlaceWork nvarchar(50)
as
BEGIN
	DECLARE @ID int
	insert into candiate(HoTen , Birth, DCThuongTru, QueQuan, Phone, Email)
	values(@HoTen , @Birth,@DiaChiTT, @QueQuan, @phone, @email)
	SET @ID = SCOPE_IDENTITY()
	Insert into ExperienceCandidate(CandiateID, ExpYear, Skill, LastCompany)
	values (@ID, @ExpYear, @Skill, @LastPlaceWork)
END

create proc addFreshCandidate
	@HoTen nvarchar(50),
	@Birth Date, 
	@DiaChiTT nvarchar(100), 
	@QueQuan nvarchar(100), 
	@phone nvarchar(10), 
	@email nvarchar(40),
	@GraduateDate Date,
	@GradudateRank nvarchar(10), 
	@GradudateSchool nvarchar(50)
as
BEGIN
	DECLARE @ID int
	insert into candiate(HoTen , Birth, DCThuongTru, QueQuan, Phone, Email)
	values(@HoTen , @Birth,@DiaChiTT, @QueQuan, @phone, @email)
	SET @ID = SCOPE_IDENTITY()
	Insert into FresherCandidate(CandiateID, GraduateDate, GraduateRank, GraduateSchool)
	values (@ID, @GraduateDate, @GradudateRank, @GradudateSchool)
END

create proc addInternCandidate
	@HoTen nvarchar(50),
	@Birth Date, 
	@DiaChiTT nvarchar(100), 
	@QueQuan nvarchar(100), 
	@phone nvarchar(10), 
	@email nvarchar(40),
	@Nganh nvarchar(100),
	@HocKy int, 
	@School nvarchar(100),
	@GraduateDate date
as
BEGIN
	DECLARE @ID int
	insert into candiate(HoTen , Birth, DCThuongTru, QueQuan, Phone, Email)
	values(@HoTen , @Birth,@DiaChiTT, @QueQuan, @phone, @email)
	SET @ID = SCOPE_IDENTITY()
	Insert into InternCandidate(CandiateID, Major, Term, School, GraduateDate )
	values (@ID, @Nganh, @HocKy, @School, @GraduateDate)
END

exec addExpCandidate 'Haru', '07-02-2005', 'Quy Nhon', 'BinhDinh', '0356701052', 'khanhduong18072005@gmail.com', 3.3, 'Famework', 'FPT'
delete candiate
select * from candiate
select * from FresherCandidate
select * from InternCandidate
select * from ExperienceCandidate