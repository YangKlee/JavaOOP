 create database StudentsManager
 go
 use StudentsManager
 
 create table Students(
	StudentID int identity(1,1) primary key,
	HoTen nvarchar(100) not null,
	NgaySinh date not null,
	GioiTinh nvarchar(20) not null,
	DiaChiTT nvarchar(100) not null,
	QueQuan nvarchar(100) not null,
	SoDT char(10) not null,
	Email nvarchar(100) not null
 );

 create table ExamStudents(
	StudentID int  
	foreign key references Students(StudentID)
	on update cascade on delete cascade,
	NgayThiTuyen Date not null,
	TongDiemThi float not null,
	primary key (StudentID)

 );
 create table DirectStudents(
 	StudentID int  
	foreign key references Students(StudentID)
	on update cascade on delete cascade,
	CapDoGiai nvarchar(20) not null,
	TenGiai nvarchar(100) not null,
	NamDatGiai int not null,
	XepLoaiGiai nvarchar(20) not null,

	primary key (StudentID)
 );
  drop proc procExamStudent
 create proc procExamStudent
	@HoTen nvarchar(100) ,
	@NgaySinh date ,
	@GioiTinh nvarchar(20) ,
	@DiaChiTT nvarchar(100) ,
	@QueQuan nvarchar(100) ,
	@SoDT char(10) ,
	@Email nvarchar(100),
	@NgayThiTuyen date,
	@TongDiem float
 as
 BEGIN
	DECLARE @ID int
	Insert into Students(HoTen, NgaySinh, GioiTinh, DiaChiTT, QueQuan,SoDT, Email)
	values(@HoTen, @NgaySinh, @GioiTinh, @DiaChiTT, @QueQuan,@SoDT, @Email)
	SET @ID = SCOPE_IDENTITY()
	insert into ExamStudents(StudentID,NgayThiTuyen, TongDiemThi)
	values(@ID,@NgayThiTuyen, @TongDiem)
END
drop proc procDirectStudent
create proc procDirectStudent
	@HoTen nvarchar(100) ,
	@NgaySinh date ,
	@GioiTinh nvarchar(20) ,
	@DiaChiTT nvarchar(100) ,
	@QueQuan nvarchar(100) ,
	@SoDT char(10) ,
	@Email nvarchar(100),
	@CapDoGiai nvarchar(20) ,
	@TenGiai nvarchar(100) ,
	@NamDatGiai int ,
	@XepLoaiGiai nvarchar(20) 
 as
 BEGIN
	DECLARE @ID int
	Insert into Students(HoTen, NgaySinh, GioiTinh, DiaChiTT, QueQuan,SoDT, Email)
	values(@HoTen, @NgaySinh, @GioiTinh, @DiaChiTT, @QueQuan,@SoDT, @Email)
	SET @ID = SCOPE_IDENTITY()
	insert into DirectStudents(StudentID,CapDoGiai, TenGiai, NamDatGiai, XepLoaiGiai)
	values (@ID, @CapDoGiai, @TenGiai, @NamDatGiai, @XepLoaiGiai)
END
delete students
select * from Students
select * from ExamStudents
select * from DirectStudents