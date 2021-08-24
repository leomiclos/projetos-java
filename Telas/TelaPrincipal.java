package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JFrame {
    private JPanel jpn = new JPanel();
    private JButton bLogin = new JButton("JOGAR");
    private JButton bCadastro = new JButton("NOVO AVATAR");
    private JButton bSair = new JButton("SAIR");
    private JButton bRanking = new JButton("RANKING");
    private JLabel lblJenius = new JLabel("Jenius");
    private JLabel lblGame = new JLabel("Master");

    public TelaPrincipal() {
        super("Jenius - A melhor versão");
        this.jpn.setForeground(new Color(47, 79, 79));
        this.jpn.setBackground(new Color(47, 79, 79));
        this.bLogin.setForeground(Color.BLACK);
        this.bLogin.setBackground(new Color(255, 215, 0));
        this.bCadastro.setBackground(new Color(255, 215, 0));
        this.bCadastro.setForeground(Color.BLACK);
        this.bSair.setBackground(new Color(255, 215, 0));
        this.bSair.setForeground(Color.BLACK);
        this.bRanking.setBackground(new Color(255, 215, 0));
        this.bRanking.setForeground(Color.BLACK);
        this.lblJenius.setForeground(Color.WHITE);
        this.lblGame.setForeground(Color.WHITE);
        this.jpn.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.bLogin.setBounds(10, 254, 142, 55);
        this.bCadastro.setBounds(162, 254, 142, 55);
        this.bSair.setBounds(472, 254, 142, 55);
        this.bRanking.setBounds(320, 254, 142, 55);
        this.lblJenius.setBounds(148, 73, 345, 135);
        this.lblGame.setBounds(322, 149, 350, 84);
        this.bLogin.setFont(new Font("Microsoft YaHei", 1, 14));
        this.bCadastro.setFont(new Font("Microsoft YaHei", 1, 12));
        this.bSair.setFont(new Font("Microsoft YaHei", 1, 14));
        this.bRanking.setFont(new Font("Microsoft YaHei", 1, 14));
        this.lblJenius.setFont(new Font("Mongolian Baiti", 3, 99));
        this.lblGame.setFont(new Font("Mongolian Baiti", 3, 32));
        this.setContentPane(this.jpn);
        this.jpn.setLayout((LayoutManager)null);
        this.jpn.add(this.bLogin);
        this.jpn.add(this.bCadastro);
        this.jpn.add(this.bSair);
        this.jpn.add(this.bRanking);
        this.jpn.add(this.lblJenius);
        this.jpn.add(this.lblGame);
        this.setDefaultCloseOperation(3);
        this.setSize(640, 480);
        this.bLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaPrincipal.this.dispose();
                TelaLogin Tela = new TelaLogin();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bLogin.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaPrincipal.this.bLogin.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaPrincipal.this.bLogin.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaPrincipal.this.bLogin.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaPrincipal.this.bLogin.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaPrincipal.this.bLogin.setBackground(Color.YELLOW);
            }
        });
        this.bCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaPrincipal.this.dispose();
                TelaCadastro Tela = new TelaCadastro();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bCadastro.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaPrincipal.this.bCadastro.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaPrincipal.this.bCadastro.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaPrincipal.this.bCadastro.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaPrincipal.this.bCadastro.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaPrincipal.this.bCadastro.setBackground(Color.YELLOW);
            }
        });
        this.bSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaPrincipal.this.dispose();
                TelaPrincipal.this.setDefaultCloseOperation(3);
                TelaPrincipal.this.setSize(640, 480);
                TelaPrincipal.this.setResizable(false);
                TelaPrincipal.this.setVisible(false);
            }
        });
        this.bSair.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaPrincipal.this.bSair.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaPrincipal.this.bSair.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaPrincipal.this.bSair.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaPrincipal.this.bSair.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaPrincipal.this.bSair.setBackground(Color.YELLOW);
            }
        });
        this.bRanking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaPrincipal.this.dispose();
                TelaRankingLixo Tela = new TelaRankingLixo();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bRanking.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaPrincipal.this.bRanking.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaPrincipal.this.bRanking.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaPrincipal.this.bRanking.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaPrincipal.this.bRanking.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaPrincipal.this.bRanking.setBackground(Color.YELLOW);
            }
        });
    }
}
