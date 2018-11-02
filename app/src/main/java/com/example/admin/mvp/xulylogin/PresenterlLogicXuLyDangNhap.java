package com.example.admin.mvp.xulylogin;

public class PresenterlLogicXuLyDangNhap implements PresenterlXuLyDangNhap{
    ViewXuLyDangNhap viewXuLyDangNhap;

    public PresenterlLogicXuLyDangNhap(ViewXuLyDangNhap viewXuLyDangNhap){
        this.viewXuLyDangNhap = viewXuLyDangNhap;
    }
    @Override
    public void kiemTraDangNhap(String name, String pass) {
        // Gọi tới Model để lấy dữ liệu

        if(name.equals("Hiep") && pass.equals("123")){
            // Kiểm tra đăng nhập
            // Đang nhập thành công
            viewXuLyDangNhap.dangNhapThnahCong(name);
        } else {
            // Trả ra cho View đăng nhập thất bại
        }
    }
}
