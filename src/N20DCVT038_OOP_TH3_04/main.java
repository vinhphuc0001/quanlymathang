package N20DCVT038_OOP_TH3_04;
public class main {

	public static void main(String[] args) {
		// Tạo ngày sản xuất
        NgaySanXuat ngaySanXuat1 = new NgaySanXuat(10, 5, 2022);
        NgaySanXuat ngaySanXuat2 = new NgaySanXuat(15, 8, 2023);

        // Tạo quốc gia
        QuocGia quocGia1 = new QuocGia("US", "United States");
        QuocGia quocGia2 = new QuocGia("JP", "Japan");

        // Tạo hãng sản xuất
        HangSanXuat hangSanXuat1 = new HangSanXuat("Apple", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("Sony", quocGia2);

        // Tạo máy tính
        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngaySanXuat1, 1500.0, 12);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngaySanXuat2, 1200.0, 18);

        // Test methods
        System.out.println("Tên quốc gia sản xuất máy tính 1: " + mayTinh1.layTenQuocGiaSanXuat());
        System.out.println("Tên quốc gia sản xuất máy tính 2: " + mayTinh2.layTenQuocGiaSanXuat());

        if (mayTinh1.kiemTraGiaBanThapHon(mayTinh2)) {
            System.out.println("Máy tính 1 có giá bán thấp hơn máy tính 2");
        } else {
            System.out.println("Máy tính 2 có giá bán thấp hơn máy tính 1");
        }
    }
}
