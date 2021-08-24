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
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class TelaRankingLixo extends JFrame {
    private final JButton bFacil = new JButton("FACIL");
    private final JButton bGeral = new JButton("GERAL");
    private final JButton bMedio = new JButton("MEDIO");
    private final JButton bDificil = new JButton("DIFICIL");
    private final JButton bSuperDificil = new JButton("SUPER DIFICIL");
    private final JButton bVoltar = new JButton("VOLTAR");

    public TelaRankingLixo() {
        super("Jenius - A melhor versão");
        JPanel jpn = new JPanel();
        jpn.setBackground(new Color(47, 79, 79));
        this.bGeral.setForeground(Color.BLACK);
        this.bGeral.setBackground(new Color(255, 215, 0));
        this.bFacil.setForeground(Color.BLACK);
        this.bFacil.setBackground(new Color(255, 215, 0));
        this.bMedio.setForeground(Color.BLACK);
        this.bMedio.setBackground(new Color(255, 215, 0));
        this.bDificil.setForeground(Color.BLACK);
        this.bDificil.setBackground(new Color(255, 215, 0));
        this.bSuperDificil.setForeground(Color.BLACK);
        this.bSuperDificil.setBackground(new Color(255, 215, 0));
        this.bVoltar.setForeground(Color.BLACK);
        this.bVoltar.setBackground(new Color(255, 215, 0));
        jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.bGeral.setBounds(255, 86, 124, 45);
        this.bFacil.setBounds(255, 142, 124, 45);
        this.bMedio.setBounds(255, 202, 124, 45);
        this.bDificil.setBounds(255, 258, 124, 45);
        this.bSuperDificil.setBounds(255, 314, 124, 45);
        this.bVoltar.setBounds(10, 48, 100, 37);
        this.bGeral.setFont(new Font("Tahoma", 0, 12));
        this.bFacil.setFont(new Font("Tahoma", 0, 12));
        this.bMedio.setFont(new Font("Tahoma", 0, 12));
        this.bDificil.setFont(new Font("Tahoma", 0, 12));
        this.bSuperDificil.setFont(new Font("Tahoma", 0, 12));
        jpn.add(this.bGeral);
        jpn.add(this.bFacil);
        jpn.add(this.bMedio);
        jpn.add(this.bDificil);
        jpn.add(this.bSuperDificil);
        jpn.add(this.bVoltar);
        this.setContentPane(jpn);
        jpn.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(3);
        this.setSize(640, 480);
        this.bGeral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRankingLixo.this.dispose();
                TelaRanking_Geral Tela = new TelaRanking_Geral();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bGeral.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaRankingLixo.this.bGeral.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaRankingLixo.this.bGeral.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaRankingLixo.this.bGeral.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaRankingLixo.this.bGeral.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaRankingLixo.this.bGeral.setBackground(Color.YELLOW);
            }
        });
        this.bFacil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRankingLixo.this.dispose();
                TelaRanking_Facil Tela = new TelaRanking_Facil();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bFacil.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaRankingLixo.this.bFacil.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaRankingLixo.this.bFacil.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaRankingLixo.this.bFacil.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaRankingLixo.this.bFacil.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaRankingLixo.this.bFacil.setBackground(Color.YELLOW);
            }
        });
        this.bMedio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRankingLixo.this.dispose();
                TelaRanking_Medio Tela = new TelaRanking_Medio();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bMedio.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaRankingLixo.this.bMedio.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaRankingLixo.this.bMedio.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaRankingLixo.this.bMedio.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaRankingLixo.this.bMedio.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaRankingLixo.this.bMedio.setBackground(Color.YELLOW);
            }
        });
        this.bDificil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRankingLixo.this.dispose();
                TelaRanking_Dificil Tela = new TelaRanking_Dificil();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bDificil.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaRankingLixo.this.bDificil.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaRankingLixo.this.bDificil.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaRankingLixo.this.bDificil.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaRankingLixo.this.bDificil.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaRankingLixo.this.bDificil.setBackground(Color.YELLOW);
            }
        });
        this.bSuperDificil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRankingLixo.this.dispose();
                TelaRanking_SuperDificil Tela = new TelaRanking_SuperDificil();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bSuperDificil.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaRankingLixo.this.bSuperDificil.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaRankingLixo.this.bSuperDificil.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaRankingLixo.this.bSuperDificil.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaRankingLixo.this.bSuperDificil.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaRankingLixo.this.bSuperDificil.setBackground(Color.YELLOW);
            }
        });
        this.bVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRankingLixo.this.dispose();
                TelaPrincipal Tela = new TelaPrincipal();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bVoltar.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaRankingLixo.this.bVoltar.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaRankingLixo.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaRankingLixo.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaRankingLixo.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaRankingLixo.this.bVoltar.setBackground(Color.YELLOW);
            }
        });
    }
}
