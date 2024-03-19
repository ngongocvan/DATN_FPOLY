create database DATN_SD41_ver2
go
drop database DATN_SD41_ver2
go

create table khach_hang (
	id uniqueidentifier primary key default newid(),
	ma varchar(20) unique,
	avatar varchar(20) null,
	ho_ten nvarchar(50) default null,
	ngay_sinh date null,
	sdt nvarchar(15) null,
	email nvarchar(255) null,
	mat_khau nvarchar(255) null,
	id_hkh uniqueidentifier null,
	trangthai int null,

)
create table chuc_vu (
	id uniqueidentifier primary key default newid(),
	ma varchar(20) unique,
	ten nvarchar(50) default null,
	trangthai int null
)
create table nhan_vien (
	id uniqueidentifier primary key default newid(),
	ma varchar(20) unique,
	ho_ten nvarchar(50) default null,
	ngay_sinh date null,
	dia_chi nvarchar(255) null,
	xa nvarchar(250) default null,
	huyen nvarchar(50) default null,
	thanh_pho nvarchar(255) null,
	anh varchar(20) null,
	sdt nvarchar(15) null,
	email nvarchar(255) null,
	id_chuc_vu uniqueidentifier,
	mat_khau nvarchar(255) null,
	ngay_vao_lam date null,
	ngay_nghi_viec date null,
	trangthai int null,
	foreign key (id_chuc_vu) references chuc_vu(id),
)

create table thuong_hieu (
	id uniqueidentifier primary key default newid(),
	thuong_hieu nvarchar(200),
	ngay_tao date,
	ngay_sua date,
	trangthai int null
)
create table xuat_xu (
	id uniqueidentifier primary key default newid(),
	xuat_xu nvarchar(200),
	ngay_tao date,
	ngay_sua date,
	trangthai int null
)
create table kieu_dang (
	id uniqueidentifier primary key default newid(),
	kieu_dang nvarchar(200),
	ngay_tao date,
	ngay_sua date,
	trangthai int null
)
create table chat_lieu (
	id uniqueidentifier primary key default newid(),
	ma varchar(20) unique,
	ten nvarchar(50) default null,
	trangthai int null
)
create table mau_sac (
	id uniqueidentifier primary key default newid(),
	ma varchar(20) unique,
	ten nvarchar(50) default null,
	trangthai int null
)
create table kich_co (
	id uniqueidentifier primary key default newid(),
	kich_co nvarchar(200),
	ngay_tao date,
	ngay_sua date,
	trangthai int null
)
create table anh_san_pham(
   id uniqueidentifier primary key default newid(),
	anh_san_pham nvarchar(200),
	ngay_tao date,
	ngay_sua date,
	trangthai int null
)
create table mau_ma(
    id uniqueidentifier primary key default newid(),
	mau_ma nvarchar(200),
	ngay_tao date,
	ngay_sua date,
	trangthai int null
)


create table chi_tiet_dep(
	id uniqueidentifier primary key default newid(),
    id_mau_ma uniqueidentifier,
	id_thuong_hieu uniqueidentifier,
	id_chat_lieu uniqueidentifier,
	id_mau_sac uniqueidentifier,
	id_xuat_xu uniqueidentifier,
	id_kieu_dang uniqueidentifier,
	id_anh_san_pham uniqueidentifier,
	id_kich_co uniqueidentifier,
	mo_ta  nvarchar(255) null,
	so_luong int,
	trang_thai int null,
	mau_ma nvarchar(255),
	thuong_hieu nvarchar(255),
	chat_lieu nvarchar(255),
	mau_sac nvarchar(255),
	xuat_xu nvarchar(255),
	kieu_dang nvarchar(255),
	anh_san_pham nvarchar(255),
	ngay_nhap date ,
	gia_nhap money,
	gia_ban money,	 
	foreign key (id_thuong_hieu) references thuong_hieu(id),
	foreign key (id_chat_lieu) references chat_lieu(id),
	foreign key (id_xuat_xu) references xuat_xu(id),
	foreign key (id_kieu_dang) references kieu_dang(id),
	foreign key (id_mau_sac) references mau_sac(id),
    foreign key (id_kich_co) references kich_co(id),
	foreign key (id_mau_ma) references mau_ma(id),
	foreign key (id_anh_san_pham) references anh_san_pham(id)


)

create table dep (
	id uniqueidentifier primary key default newid(),
	ma varchar(20) unique,
	ten nvarchar(200) default null,
	id_thuong_hieu uniqueidentifier,
	id_gioi_tinh uniqueidentifier,
	id_chat_lieu uniqueidentifier,
	id_mau_sac uniqueidentifier,
	id_xuat_xu uniqueidentifier,
	id_kieu_dang uniqueidentifier,
	id_chi_tiet_dep uniqueidentifier,
	mota nvarchar(255) null,
	gia_nhap decimal,
	gia_ban decimal,
	trang_thai int null,
	gia_sau_khuyen_mai decimal,
	ngay_nhap date null,
	do_hot int null,
	foreign key (id_chi_tiet_dep ) references chi_tiet_dep(id),
	
)


create table dia_chi (
	id uniqueidentifier primary key default newid(),
	ma nvarchar(50) default null,
	id_khach_hang uniqueidentifier,
    id_nhan_vien uniqueidentifier,
	xa nvarchar(250) default null,
	quan nvarchar(250) default null,
	huyen nvarchar(50) default null,
	thanh_pho nvarchar(50) default null,
	ngay_tao date,
	ngay_sua date,
	trangthai int null,
	foreign key (id_khach_hang) references khach_hang(id),
	foreign key (id_nhan_vien) references nhan_vien(id)
)


create table gio_hang_chi_tiet (
	id uniqueidentifier primary key default newid(),
	id_gio_hang uniqueidentifier null,
	id_dep_chi_tiet uniqueidentifier null,
	so_luong int null,
	ghi_chu nvarchar(255) null,
	trangthai int null,
	
)
create table gio_hang (
	id uniqueidentifier primary key default newid(),
	id_gio_hang_chi_tiet uniqueidentifier null,
	ma varchar(20) unique,
	id_khach_hang uniqueidentifier null,
	ngay_tao date null,
	ngay_cap_nhap date null,
	ghi_chu nvarchar(255) null,
	trangthai int null,
	foreign key (id_gio_hang_chi_tiet) references gio_hang_chi_tiet(id),
)
create table thanh_toan(
	id uniqueidentifier primary key default newid(),
	hinh_thuc_thanh_toan nvarchar(100),
	trang_thai int null,

)
create table hoa_don (
   id uniqueidentifier primary key default newid(),
	ma varchar(20) unique,
	ngay_tao date null,
	id_nhan_vien uniqueidentifier,
	id_khach_hang uniqueidentifier,
	id_dep uniqueidentifier,
	id_thanh_toan uniqueidentifier,
	mo_ta nvarchar(255) null,
	trangthai int null,
	foreign key (id_nhan_vien) references nhan_vien(id),
	foreign key (id_khach_hang) references khach_hang(id),
	foreign key (id_dep) references dep(id),
	foreign key (id_thanh_toan) references thanh_toan(id)
	
)

create table hoa_don_chi_tiet (
	id uniqueidentifier primary key default newid(),
	id_hoa_don uniqueidentifier,
	id_gio_hang uniqueidentifier,
	id_gio_hang_chi_tiet uniqueidentifier,
	id_dep_chi_tiet uniqueidentifier,
	ten_nguoi_nhan nvarchar(255) null,
	sdt_nguoi_nhan nvarchar(255) null,
	dia_chi nvarchar(255) null,
	tong_tien decimal,
	hinh_thuc_mua int,		--1 online 0 offline
	hinh_thuc_thanh_toan int, --1 VNPAY  0 Tiền mặt 3 Khi nhận hàng
	hinh_thuc_nhan_hang int, --1 giao hàng --0 tại quầy	
	phi_ship money,
	so_luong int,
	gia_nhap decimal,
	don_gia decimal,
	trang_thai int null,
	foreign key (id_hoa_don) references hoa_don(id),
	foreign key (id_gio_hang) references gio_hang(id),

	
)
drop table khach_hang
drop table hoa_don
drop table hoa_don_chi_tiet
drop table dep
drop table gio_hang
drop table gio_hang_chi_tiet

select * from dep
select* from nhan_vien
