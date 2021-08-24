package Telas;

import Classes.Jogador;
import Classes.Login;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaLogin extends JFrame {
    private JPanel jpn;
    private JPasswordField txtSenha;
    private JTextField txtLogin;
    private JButton bEntrar;
    private JButton bVoltar;
    private JLabel lblLogin;
    private JLabel lblSenha;

    public TelaLogin() {
        super("Jenius - Um jogo qualquer");
        final Login l = new Login();
        final Jogador c = new Jogador();
        this.jpn = new JPanel();
        this.bEntrar = new JButton("COMEÇAR");
        this.bVoltar = new JButton("VOLTAR");
        this.lblLogin = new JLabel("AVATAR");
        this.lblSenha = new JLabel("SENHA");
        this.txtSenha = new JPasswordField(20);
        this.txtLogin = new JTextField(20);
        this.jpn.setBackground(new Color(47, 79, 79));
        this.bEntrar.setBackground(new Color(255, 215, 0));
        this.bEntrar.setForeground(Color.BLACK);
        this.bVoltar.setBackground(new Color(255, 215, 0));
        this.bVoltar.setForeground(Color.BLACK);
        this.lblLogin.setForeground(new Color(255, 255, 255));
        this.lblSenha.setForeground(new Color(255, 255, 255));
        this.jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.bEntrar.setBounds(137, 240, 165, 57);
        this.bVoltar.setBounds(334, 240, 165, 57);
        this.lblLogin.setBounds(184, 101, 133, 41);
        this.lblSenha.setBounds(184, 153, 133, 41);
        this.txtSenha.setBounds(334, 153, 151, 41);
        this.txtLogin.setBounds(334, 101, 151, 41);
        this.txtLogin.setColumns(10);
        this.bEntrar.setFont(new Font("Microsoft YaHei", 1, 14));
        this.bVoltar.setFont(new Font("Microsoft YaHei", 1, 14));
        this.lblLogin.setFont(new Font("Microsoft YaHei", 1, 24));
        this.lblSenha.setFont(new Font("Microsoft YaHei", 1, 24));
        this.setContentPane(this.jpn);
        this.jpn.setLayout((LayoutManager)null);
        this.jpn.add(this.bEntrar);
        this.jpn.add(this.bVoltar);
        this.jpn.add(this.lblLogin);
        this.jpn.add(this.lblSenha);
        this.jpn.add(this.txtSenha);
        this.jpn.add(this.txtLogin);
        this.setDefaultCloseOperation(3);
        this.setSize(640, 480);
        this.bVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaLogin.this.dispose();
                TelaPrincipal Tela = new TelaPrincipal();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bVoltar.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaLogin.this.bVoltar.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaLogin.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaLogin.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaLogin.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaLogin.this.bVoltar.setBackground(Color.YELLOW);
            }
        });
        this.bEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c.setUsuario(TelaLogin.this.txtLogin.getText());
                c.setSenha(TelaLogin.this.txtSenha.getText());

                try {
                    Boolean res = l.ValidarUsuario(c);
                    if (res) {
                        JOptionPane.showMessageDialog((Component)null, "Seja Bem Vindo! Selecione um nível para iniciar o jogo!");
                        TelaLogin.this.dispose();
                        Jogador jog = new Jogador();
                        jog.setUsuario(TelaLogin.this.txtLogin.getText());
                        TelaJogo Tela = new TelaJogo(jog);
                        Tela.setDefaultCloseOperation(3);
                        Tela.setSize(640, 480);
                        Tela.setResizable(true);
                        Tela.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Usuário ou senha inválidos :(");
                    }
                } catch (IOException var5) {
                    var5.printStackTrace();
                    System.out.println(var5);
                }

            }
        });
        this.bEntrar.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaLogin.this.bEntrar.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaLogin.this.bEntrar.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaLogin.this.bEntrar.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaLogin.this.bEntrar.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaLogin.this.bEntrar.setBackground(Color.YELLOW);
            }
        });
    }
}
