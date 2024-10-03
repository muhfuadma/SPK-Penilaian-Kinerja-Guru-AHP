/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Koneksi.Koneksi;
import java.awt.BorderLayout;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class Report extends javax.swing.JPanel {
    Connection conn = new Koneksi().connect();

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        try {
            Connection conn = new Koneksi().connect();
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File("src/Report/dataGuru.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
    
            // Membuat JRViewer dan menampilkannya di dalam JPanel
            JRViewer viewer = new JRViewer(jasperPrint);
            pn_dataGuru.setLayout(new BorderLayout());
            pn_dataGuru.add(viewer, BorderLayout.CENTER);
            pn_dataGuru.revalidate(); // Refresh panel untuk menampilkan report

            } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
            }
        try {
            Connection conn = new Koneksi().connect();
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File("src/Report/dataKriteria.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
    
            // Membuat JRViewer dan menampilkannya di dalam JPanel
            JRViewer viewer = new JRViewer(jasperPrint);
            pn_dataKriteria.setLayout(new BorderLayout());
            pn_dataKriteria.add(viewer, BorderLayout.CENTER);
            pn_dataKriteria.revalidate(); // Refresh panel untuk menampilkan report

            } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
            }
        try {
            Connection conn = new Koneksi().connect();
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File("src/Report/nilaiKriteria.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
    
            // Membuat JRViewer dan menampilkannya di dalam JPanel
            JRViewer viewer = new JRViewer(jasperPrint);
            pn_nilaiKriteria.setLayout(new BorderLayout());
            pn_nilaiKriteria.add(viewer, BorderLayout.CENTER);
            pn_nilaiKriteria.revalidate(); // Refresh panel untuk menampilkan report

            } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
            }
        try {
            Connection conn = new Koneksi().connect();
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File("src/Report/nilaiAlternatif.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
    
            // Membuat JRViewer dan menampilkannya di dalam JPanel
            JRViewer viewer = new JRViewer(jasperPrint);
            pn_nilaiAlter.setLayout(new BorderLayout());
            pn_nilaiAlter.add(viewer, BorderLayout.CENTER);
            pn_nilaiAlter.revalidate(); // Refresh panel untuk menampilkan report

            } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
            }
        try {
            Connection conn = new Koneksi().connect();
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File("src/Report/Rangking.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
    
            // Membuat JRViewer dan menampilkannya di dalam JPanel
            JRViewer viewer = new JRViewer(jasperPrint);
            pn_rank.setLayout(new BorderLayout());
            pn_rank.add(viewer, BorderLayout.CENTER);
            pn_rank.revalidate(); // Refresh panel untuk menampilkan report

            } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_report = new javax.swing.JTabbedPane();
        pn_dataGuru = new javax.swing.JPanel();
        pn_dataKriteria = new javax.swing.JPanel();
        pn_nilaiKriteria = new javax.swing.JPanel();
        pn_nilaiAlter = new javax.swing.JPanel();
        pn_rank = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        pn_report.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_dataGuruLayout = new javax.swing.GroupLayout(pn_dataGuru);
        pn_dataGuru.setLayout(pn_dataGuruLayout);
        pn_dataGuruLayout.setHorizontalGroup(
            pn_dataGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1217, Short.MAX_VALUE)
        );
        pn_dataGuruLayout.setVerticalGroup(
            pn_dataGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );

        pn_report.addTab("Data Guru", pn_dataGuru);

        javax.swing.GroupLayout pn_dataKriteriaLayout = new javax.swing.GroupLayout(pn_dataKriteria);
        pn_dataKriteria.setLayout(pn_dataKriteriaLayout);
        pn_dataKriteriaLayout.setHorizontalGroup(
            pn_dataKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1217, Short.MAX_VALUE)
        );
        pn_dataKriteriaLayout.setVerticalGroup(
            pn_dataKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );

        pn_report.addTab("Data Kriteria", pn_dataKriteria);

        javax.swing.GroupLayout pn_nilaiKriteriaLayout = new javax.swing.GroupLayout(pn_nilaiKriteria);
        pn_nilaiKriteria.setLayout(pn_nilaiKriteriaLayout);
        pn_nilaiKriteriaLayout.setHorizontalGroup(
            pn_nilaiKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1217, Short.MAX_VALUE)
        );
        pn_nilaiKriteriaLayout.setVerticalGroup(
            pn_nilaiKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );

        pn_report.addTab("Nilai Kriteria", pn_nilaiKriteria);

        javax.swing.GroupLayout pn_nilaiAlterLayout = new javax.swing.GroupLayout(pn_nilaiAlter);
        pn_nilaiAlter.setLayout(pn_nilaiAlterLayout);
        pn_nilaiAlterLayout.setHorizontalGroup(
            pn_nilaiAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1217, Short.MAX_VALUE)
        );
        pn_nilaiAlterLayout.setVerticalGroup(
            pn_nilaiAlterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );

        pn_report.addTab("Nilai Alternatif", pn_nilaiAlter);

        javax.swing.GroupLayout pn_rankLayout = new javax.swing.GroupLayout(pn_rank);
        pn_rank.setLayout(pn_rankLayout);
        pn_rankLayout.setHorizontalGroup(
            pn_rankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1217, Short.MAX_VALUE)
        );
        pn_rankLayout.setVerticalGroup(
            pn_rankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );

        pn_report.addTab("Ranking", pn_rank);

        add(pn_report, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pn_dataGuru;
    private javax.swing.JPanel pn_dataKriteria;
    private javax.swing.JPanel pn_nilaiAlter;
    private javax.swing.JPanel pn_nilaiKriteria;
    private javax.swing.JPanel pn_rank;
    private javax.swing.JTabbedPane pn_report;
    // End of variables declaration//GEN-END:variables
}
