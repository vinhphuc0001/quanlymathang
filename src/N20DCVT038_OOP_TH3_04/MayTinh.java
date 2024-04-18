package N20DCVT038_OOP_TH3_04;

public class MayTinh {
	private HangSanXuat hangSanXuat;
    private NgaySanXuat ngaySanXuat;
    private double giaBan;
    private int thoiGianBaoHanh;

    public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaBan, int thoiGianBaoHanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    // Phương thức kiểm tra máy tính có giá bán thấp hơn máy tính khác không
    public boolean kiemTraGiaBanThapHon(MayTinh other) {
        return this.giaBan < other.giaBan;
    }

    // Phương thức lấy tên quốc gia sản xuất máy tính
    public String layTenQuocGiaSanXuat() {
        return hangSanXuat.layTenQuocGiaSanXuat();
    }
}