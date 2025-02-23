/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlysach;

/**
 *
 * @author Asus
 */
public class Panel_inventory extends javax.swing.JPanel {

    /**
     * Creates new form Panel_inventory
     */
    public Panel_inventory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Tabbed_NhapHang = new javax.swing.JTabbedPane();
        pnl_TaoPhieuNhap = new javax.swing.JPanel();
        pnl_DanhSachSP = new javax.swing.JPanel();
        scroll_DanhSachSP = new javax.swing.JScrollPane();
        table_DanhSachSP = new javax.swing.JTable();
        pnl_ThongTinNCC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        pnl_TimKiem = new javax.swing.JPanel();
        txt_TimKiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnl_HoaDonNhapHang = new javax.swing.JPanel();
        pnl_Top = new javax.swing.JPanel();
        pnl_HDNH_TimKiem = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        pnl_BoLoc = new javax.swing.JPanel();
        pnl_LocNhanVien = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        pnl_LocNCC = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        pnl_LocTheoNgay = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        pnl_Center = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnl_DanhSachNCC = new javax.swing.JPanel();
        pnl_NCC_ThongTin = new javax.swing.JPanel();
        pnl_ThongTin = new javax.swing.JPanel();
        lb_DiaChi = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        lb_Email = new javax.swing.JLabel();
        lb_SDT = new javax.swing.JLabel();
        lb_MaNCC = new javax.swing.JLabel();
        lb_TenNCC = new javax.swing.JLabel();
        btn_CapNhat = new javax.swing.JButton();
        btn_ThemMoi = new javax.swing.JButton();
        btn_XoaTrang = new javax.swing.JButton();
        txt_SDT = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        txt_MaNCC = new javax.swing.JTextField();
        txt_TenNCC = new javax.swing.JTextField();
        pnl_TimKiem_NCC = new javax.swing.JPanel();
        txt_TimKiem_NCC = new javax.swing.JTextField();
        btn_TimKiem_NCC = new javax.swing.JButton();
        pnl_NCC_Table = new javax.swing.JPanel();
        scroll_NCC = new javax.swing.JScrollPane();
        table_NCC = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        pnl_TaoPhieuNhap.setLayout(new java.awt.BorderLayout());

        pnl_DanhSachSP.setLayout(new java.awt.BorderLayout());

        table_DanhSachSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SP001", "Sách vật lý", "200", "40.000", "8.000.000"},
                {"SP003", "Sách tiếng anh", "100", "50.000", "5.000.000"},
                {"SP016", "Giấy ghi chú", "60", "10.000", "600.000"}
            },
            new String [] {
                "Mã SP", "Tên sản phẩm", "Số lượng nhập", "Đơn giá nhập", "Thành tiền"
            }
        ));
        scroll_DanhSachSP.setViewportView(table_DanhSachSP);

        pnl_DanhSachSP.add(scroll_DanhSachSP, java.awt.BorderLayout.CENTER);

        pnl_TaoPhieuNhap.add(pnl_DanhSachSP, java.awt.BorderLayout.CENTER);

        pnl_ThongTinNCC.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhà cung cấp"));
        pnl_ThongTinNCC.setPreferredSize(new java.awt.Dimension(400, 10));
        pnl_ThongTinNCC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tổng tiền:");
        pnl_ThongTinNCC.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NCC 1", "NCC 2", "NCC 3", "NCC 4" }));
        pnl_ThongTinNCC.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 260, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nhà cung cấp:");
        pnl_ThongTinNCC.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        pnl_ThongTinNCC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 260, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ghi chú:");
        pnl_ThongTinNCC.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setText("13.600.000");
        pnl_ThongTinNCC.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 260, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Tạo yêu cầu nhập hàng");
        pnl_ThongTinNCC.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 340, 70));

        jRadioButton1.setText("Đã nhận");
        pnl_ThongTinNCC.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jRadioButton2.setText("Chưa nhận");
        pnl_ThongTinNCC.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        pnl_TaoPhieuNhap.add(pnl_ThongTinNCC, java.awt.BorderLayout.EAST);

        pnl_TimKiem.setPreferredSize(new java.awt.Dimension(200, 70));
        pnl_TimKiem.setLayout(new java.awt.BorderLayout());

        txt_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_TimKiem.setText("Nhập mã SP...");
        pnl_TimKiem.add(txt_TimKiem, java.awt.BorderLayout.CENTER);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Tìm kiếm");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 27));
        pnl_TimKiem.add(jButton1, java.awt.BorderLayout.EAST);

        pnl_TaoPhieuNhap.add(pnl_TimKiem, java.awt.BorderLayout.NORTH);

        Tabbed_NhapHang.addTab("Tạo phiếu nhập hàng", pnl_TaoPhieuNhap);

        pnl_HoaDonNhapHang.setLayout(new java.awt.BorderLayout());

        pnl_Top.setPreferredSize(new java.awt.Dimension(0, 220));
        pnl_Top.setLayout(new java.awt.BorderLayout());

        pnl_HDNH_TimKiem.setPreferredSize(new java.awt.Dimension(10, 70));
        pnl_HDNH_TimKiem.setLayout(new java.awt.BorderLayout());

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setText("Nhập mã hóa đơn...");
        pnl_HDNH_TimKiem.add(jTextField2, java.awt.BorderLayout.CENTER);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Tìm");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 27));
        pnl_HDNH_TimKiem.add(jButton3, java.awt.BorderLayout.EAST);

        pnl_Top.add(pnl_HDNH_TimKiem, java.awt.BorderLayout.NORTH);

        pnl_BoLoc.setLayout(new java.awt.GridLayout(1, 3, 20, 0));

        pnl_LocNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_LocNhanVien.setLayout(new javax.swing.BoxLayout(pnl_LocNhanVien, javax.swing.BoxLayout.Y_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Lọc theo nhân viên");
        jPanel1.add(jLabel5);

        pnl_LocNhanVien.add(jPanel1);

        jTextField4.setText("Nhập số điện thoại NV...");
        jTextField4.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel2.add(jTextField4);

        pnl_LocNhanVien.add(jPanel2);

        pnl_BoLoc.add(pnl_LocNhanVien);

        pnl_LocNCC.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_LocNCC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NCC 1", "NCC 2", "NCC 3", "NCC 4" }));
        pnl_LocNCC.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 330, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Lọc theo NCC");
        pnl_LocNCC.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        pnl_BoLoc.add(pnl_LocNCC);

        pnl_LocTheoNgay.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_LocTheoNgay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Lọc theo NCC");
        pnl_LocTheoNgay.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));
        pnl_LocTheoNgay.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 350, 50));

        pnl_BoLoc.add(pnl_LocTheoNgay);

        pnl_Top.add(pnl_BoLoc, java.awt.BorderLayout.CENTER);

        pnl_HoaDonNhapHang.add(pnl_Top, java.awt.BorderLayout.NORTH);

        pnl_Center.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PN001", "23/10/2023", "Nhân vIen 1", "NCC 1", "chưa nhận", "2.000.000", "IN"},
                {"PN002I", "24/10/2023", "Nhân Viên 3", "NCC 1", "đã nhận", "1.560.000", "IN"},
                {"PN003", "27/10/2023", " Nhân Viên 3", " NCC 2 ", " chưa nhận ", "2.300.000", "IN"}
            },
            new String [] {
                "Phiếu nhập", "Ngày nhập", "Người nhập", "Nhà cung cấp", "Trạng thái", "Tổng tiền", "In phiếu nhập"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        pnl_Center.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pnl_HoaDonNhapHang.add(pnl_Center, java.awt.BorderLayout.CENTER);

        Tabbed_NhapHang.addTab("Hóa đơn nhập hàng", pnl_HoaDonNhapHang);

        pnl_DanhSachNCC.setLayout(new java.awt.BorderLayout());

        pnl_NCC_ThongTin.setPreferredSize(new java.awt.Dimension(10, 250));
        pnl_NCC_ThongTin.setLayout(new java.awt.BorderLayout());

        pnl_ThongTin.setMinimumSize(new java.awt.Dimension(10, 150));
        pnl_ThongTin.setPreferredSize(new java.awt.Dimension(10, 150));
        pnl_ThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_DiaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_DiaChi.setText("Địa chỉ:");
        pnl_ThongTin.add(lb_DiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        txt_Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnl_ThongTin.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 310, 40));

        lb_Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_Email.setText("Email:");
        pnl_ThongTin.add(lb_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lb_SDT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_SDT.setText("SĐT:");
        pnl_ThongTin.add(lb_SDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        lb_MaNCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_MaNCC.setText("Mã NCC:");
        pnl_ThongTin.add(lb_MaNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lb_TenNCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_TenNCC.setText("Tên NCC:");
        pnl_ThongTin.add(lb_TenNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        btn_CapNhat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_CapNhat.setText("Cập nhật");
        pnl_ThongTin.add(btn_CapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 130, -1));

        btn_ThemMoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_ThemMoi.setText("Thêm mới");
        pnl_ThongTin.add(btn_ThemMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        btn_XoaTrang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_XoaTrang.setText("Xóa trắng");
        pnl_ThongTin.add(btn_XoaTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 140, -1));

        txt_SDT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnl_ThongTin.add(txt_SDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 310, 40));

        txt_DiaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnl_ThongTin.add(txt_DiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 780, 40));

        txt_MaNCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnl_ThongTin.add(txt_MaNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 310, 40));

        txt_TenNCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pnl_ThongTin.add(txt_TenNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 330, 40));

        pnl_NCC_ThongTin.add(pnl_ThongTin, java.awt.BorderLayout.CENTER);

        pnl_TimKiem_NCC.setPreferredSize(new java.awt.Dimension(150, 70));
        pnl_TimKiem_NCC.setLayout(new java.awt.BorderLayout());

        txt_TimKiem_NCC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_TimKiem_NCC.setText("Nhập SĐT NCC...");
        pnl_TimKiem_NCC.add(txt_TimKiem_NCC, java.awt.BorderLayout.CENTER);

        btn_TimKiem_NCC.setText("Tìm Kiếm");
        btn_TimKiem_NCC.setPreferredSize(new java.awt.Dimension(150, 150));
        pnl_TimKiem_NCC.add(btn_TimKiem_NCC, java.awt.BorderLayout.EAST);

        pnl_NCC_ThongTin.add(pnl_TimKiem_NCC, java.awt.BorderLayout.SOUTH);

        pnl_DanhSachNCC.add(pnl_NCC_ThongTin, java.awt.BorderLayout.NORTH);

        pnl_NCC_Table.setLayout(new java.awt.BorderLayout());

        table_NCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NCC001", "NCC 1", "abc, Gò Vấp", "abc@gmail.com", "052364198"}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Email", "SĐT"
            }
        ));
        scroll_NCC.setViewportView(table_NCC);

        pnl_NCC_Table.add(scroll_NCC, java.awt.BorderLayout.CENTER);

        pnl_DanhSachNCC.add(pnl_NCC_Table, java.awt.BorderLayout.CENTER);

        Tabbed_NhapHang.addTab("Danh sách NCC", pnl_DanhSachNCC);

        add(Tabbed_NhapHang, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabbed_NhapHang;
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_ThemMoi;
    private javax.swing.JButton btn_TimKiem_NCC;
    private javax.swing.JButton btn_XoaTrang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lb_DiaChi;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_MaNCC;
    private javax.swing.JLabel lb_SDT;
    private javax.swing.JLabel lb_TenNCC;
    private javax.swing.JPanel pnl_BoLoc;
    private javax.swing.JPanel pnl_Center;
    private javax.swing.JPanel pnl_DanhSachNCC;
    private javax.swing.JPanel pnl_DanhSachSP;
    private javax.swing.JPanel pnl_HDNH_TimKiem;
    private javax.swing.JPanel pnl_HoaDonNhapHang;
    private javax.swing.JPanel pnl_LocNCC;
    private javax.swing.JPanel pnl_LocNhanVien;
    private javax.swing.JPanel pnl_LocTheoNgay;
    private javax.swing.JPanel pnl_NCC_Table;
    private javax.swing.JPanel pnl_NCC_ThongTin;
    private javax.swing.JPanel pnl_TaoPhieuNhap;
    private javax.swing.JPanel pnl_ThongTin;
    private javax.swing.JPanel pnl_ThongTinNCC;
    private javax.swing.JPanel pnl_TimKiem;
    private javax.swing.JPanel pnl_TimKiem_NCC;
    private javax.swing.JPanel pnl_Top;
    private javax.swing.JScrollPane scroll_DanhSachSP;
    private javax.swing.JScrollPane scroll_NCC;
    private javax.swing.JTable table_DanhSachSP;
    private javax.swing.JTable table_NCC;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_MaNCC;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenNCC;
    private javax.swing.JTextField txt_TimKiem;
    private javax.swing.JTextField txt_TimKiem_NCC;
    // End of variables declaration//GEN-END:variables
}
