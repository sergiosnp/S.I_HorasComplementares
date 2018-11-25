package View;

import Model.Aluno;

public class Home extends javax.swing.JFrame {
    
    private final Aluno aluno;
    
    public Home(Aluno aluno) {
        this.aluno = aluno;
        initComponents();
        System.out.println("Esta é a tela Home");
        System.out.println("================================================");
    }

    private Home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHeader = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblNomeAluno = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jPMenu = new javax.swing.JPanel();
        jpPesquisarCertificado = new javax.swing.JPanel();
        lblPesquisarCertificado = new javax.swing.JButton();
        btnPesquisarCertificado = new javax.swing.JLabel();
        jpEnviarCertificado = new javax.swing.JPanel();
        btnEnviarCertificado = new javax.swing.JButton();
        lblEnviarCertificado = new javax.swing.JLabel();
        jDesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHeader.setBackground(new java.awt.Color(172, 196, 220));
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Home");
        jpHeader.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 204, 40));

        lblNomeAluno.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        lblNomeAluno.setForeground(new java.awt.Color(1, 1, 1));
        lblNomeAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeAluno.setText("Usuario");
        jpHeader.add(lblNomeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 100, -1));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jpHeader.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 157, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Perfil.png"))); // NOI18N
        jpHeader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 70, 60));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jpHeader.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 80, 30));

        getContentPane().add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPMenu.setBackground(new java.awt.Color(224, 224, 224));
        jPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPesquisarCertificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N

        btnPesquisarCertificado.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnPesquisarCertificado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPesquisarCertificado.setText("Pesquisar Certificado");

        javax.swing.GroupLayout jpPesquisarCertificadoLayout = new javax.swing.GroupLayout(jpPesquisarCertificado);
        jpPesquisarCertificado.setLayout(jpPesquisarCertificadoLayout);
        jpPesquisarCertificadoLayout.setHorizontalGroup(
            jpPesquisarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisarCertificadoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpPesquisarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPesquisarCertificado, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnPesquisarCertificado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jpPesquisarCertificadoLayout.setVerticalGroup(
            jpPesquisarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisarCertificadoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnPesquisarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPesquisarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPMenu.add(jpPesquisarCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 300, 330));

        btnEnviarCertificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/enviar-certificado.png.png"))); // NOI18N

        lblEnviarCertificado.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblEnviarCertificado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnviarCertificado.setText("Enviar Certificado");

        javax.swing.GroupLayout jpEnviarCertificadoLayout = new javax.swing.GroupLayout(jpEnviarCertificado);
        jpEnviarCertificado.setLayout(jpEnviarCertificadoLayout);
        jpEnviarCertificadoLayout.setHorizontalGroup(
            jpEnviarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnviarCertificadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpEnviarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEnviarCertificado, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(lblEnviarCertificado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpEnviarCertificadoLayout.setVerticalGroup(
            jpEnviarCertificadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEnviarCertificadoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblEnviarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPMenu.add(jpEnviarCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 330));

        getContentPane().add(jPMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 660));
        getContentPane().add(jDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 1060, 660));

        setSize(new java.awt.Dimension(1376, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        Login tela = new Login();
        tela.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        listarAluno();
    }//GEN-LAST:event_btnEditarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
        
    }
    
    public void listarAluno() {
        if(aluno == null) {
            System.out.println("Aluno é null!");
        } else {
            System.out.println("Id: " + aluno.getIdAluno());
            System.out.println("Nome: " + aluno.getCadastro().getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Cpf: " + aluno.getCadastro().getCpf());
            System.out.println("Email: " + aluno.getCadastro().getEmail());
            System.out.println("Senha: " + aluno.getCadastro().getSenha());
            System.out.println("Data de nascimento: " + aluno.getCadastro().getData_nascimento());
            System.out.println("Campus: " + aluno.getCadastro().getCampus());
            System.out.println("Curso: " + aluno.getCadastro().getCurso());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEnviarCertificado;
    private javax.swing.JLabel btnPesquisarCertificado;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jpEnviarCertificado;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpPesquisarCertificado;
    private javax.swing.JLabel lblEnviarCertificado;
    private javax.swing.JLabel lblNomeAluno;
    private javax.swing.JButton lblPesquisarCertificado;
    // End of variables declaration//GEN-END:variables
}
