package Telas;

import Classes.Dificuldade;
import Classes.Jogador;
import Classes.Jogo;
import Classes.Ranking;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaJogo extends JFrame {
    private JPanel jpn = new JPanel();
    private JLabel label_pontos = new JLabel("");
    private JLabel lblPontos = new JLabel("Pontos:");
    private JButton bFacil = new JButton("FÁCIL");
    private JButton bMedio = new JButton("MÉDIO");
    private JButton bDificil = new JButton("DIFÍCIL");
    private JButton bSuperDificil = new JButton("SUPER DIFÍCIL");
    private JButton bVoltar = new JButton("VOLTAR");
    private JButton bVermelho = new JButton("");
    private JButton bAmarelo = new JButton("");
    private JButton bVerde = new JButton("");
    private JButton bMaiorSequencia = new JButton("+ SEQUÊNCIA");
    private JButton bAzul = new JButton("");
    private JButton bJogar = new JButton("JOGAR");
    private JButton bSalvar = new JButton("SALVAR");
    private JButton bRepetir;
    Jogo J = new Jogo();
    Jogador jj = new Jogador();
    Dificuldade dif = new Dificuldade();
    Ranking r = new Ranking();

    public TelaJogo(final Jogador jog) {
        super("Jenius - Um jogo qualquer");
        this.label_pontos.setFont(new Font("Tahoma", 0, 18));
        this.bRepetir = new JButton("REPETIR");
        this.jpn.setBackground(new Color(50, 79, 79));
        this.bAmarelo.setForeground(Color.YELLOW);
        this.bAmarelo.setBackground(Color.WHITE);
        this.bVerde.setBackground(Color.WHITE);
        this.bVerde.setForeground(Color.GREEN);
        this.bAzul.setBackground(Color.WHITE);
        this.bAzul.setForeground(Color.BLUE);
        this.bVermelho.setForeground(Color.RED);
        this.bVermelho.setBackground(Color.WHITE);
        this.label_pontos.setForeground(Color.WHITE);
        this.lblPontos.setForeground(Color.WHITE);
        this.bFacil.setBackground(Color.WHITE);
        this.bFacil.setForeground(Color.BLACK);
        this.bSalvar.setBackground(Color.WHITE);
        this.bSalvar.setForeground(Color.RED);
        this.bMedio.setBackground(Color.WHITE);
        this.bMedio.setForeground(Color.BLACK);
        this.bDificil.setBackground(Color.WHITE);
        this.bDificil.setForeground(Color.BLACK);
        this.bSuperDificil.setBackground(Color.WHITE);
        this.bSuperDificil.setForeground(Color.BLACK);
        this.bMaiorSequencia.setBackground(Color.WHITE);
        this.bMaiorSequencia.setForeground(Color.RED);
        this.bVoltar.setBackground(new Color(255, 215, 0));
        this.bVoltar.setForeground(Color.BLACK);
        this.bRepetir.setForeground(Color.RED);
        this.bRepetir.setBackground(Color.WHITE);
        this.jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.bVoltar.setBounds(10, 48, 100, 37);
        this.bFacil.setBounds(10, 118, 127, 37);
        this.bMedio.setBounds(10, 166, 127, 37);
        this.bDificil.setBounds(10, 214, 127, 37);
        this.bSuperDificil.setBounds(10, 262, 127, 37);
        this.bMaiorSequencia.setBounds(10, 340, 127, 37);
        this.bAzul.setBounds(271, 81, 127, 111);
        this.bVermelho.setBounds(271, 203, 127, 111);
        this.bVerde.setBounds(405, 81, 127, 111);
        this.bAmarelo.setBounds(405, 203, 127, 111);
        this.bSalvar.setBounds(271, 340, 127, 37);
        this.bJogar.setBounds(405, 340, 127, 37);
        this.lblPontos.setBounds(405, 35, 67, 22);
        this.label_pontos.setBounds(476, 35, 67, 22);
        this.bRepetir.setBounds(134, 48, 127, 37);
        this.lblPontos.setFont(new Font("Tahoma", 0, 20));
        this.setContentPane(this.jpn);
        this.jpn.setLayout((LayoutManager)null);
        this.jpn.add(this.bVoltar);
        this.jpn.add(this.bFacil);
        this.jpn.add(this.bMedio);
        this.jpn.add(this.bDificil);
        this.jpn.add(this.bSuperDificil);
        this.jpn.add(this.bMaiorSequencia);
        this.jpn.add(this.bAzul);
        this.jpn.add(this.bVermelho);
        this.jpn.add(this.bVerde);
        this.jpn.add(this.bAmarelo);
        this.jpn.add(this.bSalvar);
        this.jpn.add(this.bJogar);
        this.jpn.add(this.lblPontos);
        this.jpn.add(this.label_pontos);
        this.jpn.add(this.bRepetir);
        this.setBackground(new Color(47, 79, 79));
        this.setDefaultCloseOperation(3);
        this.setSize(640, 480);
        this.bVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaJogo.this.dispose();
                TelaPrincipal p = new TelaPrincipal();
                p.setDefaultCloseOperation(3);
                p.setSize(640, 480);
                p.setResizable(false);
                p.setVisible(true);
            }
        });
        this.bVoltar.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaJogo.this.bVoltar.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaJogo.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaJogo.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaJogo.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaJogo.this.bVoltar.setBackground(Color.YELLOW);
            }
        });
        this.bSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaJogo.this.dispose();
                TelaPrincipal p = new TelaPrincipal();
                p.setDefaultCloseOperation(3);
                p.setSize(640, 480);
                p.setResizable(false);
                p.setVisible(true);
                TelaJogo.this.r.setDificuldade(TelaJogo.this.dif);
                TelaJogo.this.r.setJogo(TelaJogo.this.J);
                TelaJogo.this.r.setUser(jog);
                TelaJogo.this.r.SalvarRanking();
                TelaJogo.this.J.setUser(jog);
                TelaJogo.this.J.Salvar();
            }
        });
        this.bJogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaJogo.this.J.setPontos(0);
                TelaJogo.this.label_pontos.setText((String)null);
                TelaJogo.this.J.sorteia();
                TelaJogo.this.bJogar.setEnabled(false);
                TelaJogo.this.bFacil.setEnabled(false);
                TelaJogo.this.bMedio.setEnabled(false);
                TelaJogo.this.bDificil.setEnabled(false);
                TelaJogo.this.bSuperDificil.setEnabled(false);
                TelaJogo.this.bAmarelo.setEnabled(true);
                TelaJogo.this.bVerde.setEnabled(true);
                TelaJogo.this.bAzul.setEnabled(true);
                TelaJogo.this.bVermelho.setEnabled(true);
                TelaJogo.this.bMaiorSequencia.setEnabled(true);
                TelaJogo.this.bRepetir.setEnabled(true);
                TelaJogo.this.bSalvar.setEnabled(true);
                TelaJogo.this.label_pontos.setText(Integer.toString(TelaJogo.this.J.getPontos()));

                try {
                    TelaJogo.this.piscar();
                } catch (InterruptedException var3) {
                    var3.printStackTrace();
                }

            }
        });
        this.bJogar.setEnabled(false);
        this.bRepetir.setEnabled(false);
        this.bMaiorSequencia.setEnabled(false);
        this.bSalvar.setEnabled(false);
        this.bAmarelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TelaJogo.this.J.getJogador_Jogada().add(0);
                TelaJogo.this.J.verifica();
                TelaJogo.this.Mensagem();
                TelaJogo.this.ResetPiscar();
            }
        });
        this.bAmarelo.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaJogo.this.bAmarelo.setBackground(Color.WHITE);
            }

            public void mouseClicked(MouseEvent e) {
                TelaJogo.this.bAmarelo.setBackground(Color.WHITE);
            }

            public void mousePressed(MouseEvent e) {
                TelaJogo.this.bAmarelo.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                TelaJogo.this.bAmarelo.setBackground(Color.WHITE);
            }

            public void mouseEntered(MouseEvent e) {
                TelaJogo.this.bAmarelo.setBackground(Color.YELLOW);
            }
        });
        this.bAmarelo.setEnabled(false);
        this.bVerde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaJogo.this.J.getJogador_Jogada().add(1);
                TelaJogo.this.J.verifica();
                TelaJogo.this.Mensagem();
                TelaJogo.this.ResetPiscar();
            }
        });
        this.bVerde.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaJogo.this.bVerde.setBackground(Color.WHITE);
            }

            public void mouseClicked(MouseEvent e) {
                TelaJogo.this.bVerde.setBackground(Color.WHITE);
            }

            public void mousePressed(MouseEvent e) {
                TelaJogo.this.bVerde.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                TelaJogo.this.bVerde.setBackground(Color.WHITE);
            }

            public void mouseEntered(MouseEvent e) {
                TelaJogo.this.bVerde.setBackground(Color.GREEN);
            }
        });
        this.bVerde.setEnabled(false);
        this.bAzul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaJogo.this.J.getJogador_Jogada().add(2);
                TelaJogo.this.J.verifica();
                TelaJogo.this.Mensagem();
                TelaJogo.this.ResetPiscar();
            }
        });
        this.bAzul.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaJogo.this.bAzul.setBackground(Color.WHITE);
            }

            public void mouseClicked(MouseEvent e) {
                TelaJogo.this.bAzul.setBackground(Color.WHITE);
            }

            public void mousePressed(MouseEvent e) {
                TelaJogo.this.bAzul.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                TelaJogo.this.bAzul.setBackground(Color.WHITE);
            }

            public void mouseEntered(MouseEvent e) {
                TelaJogo.this.bAzul.setBackground(Color.BLUE);
            }
        });
        this.bAzul.setEnabled(false);
        this.bVermelho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaJogo.this.J.getJogador_Jogada().add(3);
                TelaJogo.this.J.verifica();
                TelaJogo.this.Mensagem();
                TelaJogo.this.ResetPiscar();
            }
        });
        this.bVermelho.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaJogo.this.bVermelho.setBackground(Color.WHITE);
            }

            public void mouseClicked(MouseEvent e) {
                TelaJogo.this.bVermelho.setBackground(Color.WHITE);
            }

            public void mousePressed(MouseEvent e) {
                TelaJogo.this.bVermelho.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                TelaJogo.this.bVermelho.setBackground(Color.WHITE);
            }

            public void mouseEntered(MouseEvent e) {
                TelaJogo.this.bVermelho.setBackground(Color.RED);
            }
        });
        this.bVermelho.setEnabled(false);
        this.bMaiorSequencia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    TelaJogo.this.piscar();
                } catch (InterruptedException var3) {
                    var3.printStackTrace();
                }

            }
        });
        this.bRepetir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    TelaJogo.this.piscar();
                } catch (InterruptedException var3) {
                    var3.printStackTrace();
                }

            }
        });
        this.bFacil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TelaJogo.this.dif.setTempo(1000);
                TelaJogo.this.dif.setID(1);
                TelaJogo.this.dif.setNome("Fácil");
                TelaJogo.this.J.setDificuldade(TelaJogo.this.dif);
                TelaJogo.this.bJogar.setEnabled(true);
                JOptionPane.showMessageDialog((Component)null, "Nível de jogo selecionado para: Fácil");
                TelaJogo.this.bJogar.setBackground(Color.RED);
                TelaJogo.this.bJogar.setForeground(Color.WHITE);

                try {
                    TelaJogo.this.update(TelaJogo.this.getGraphics());
                    Thread.sleep(500L);
                } catch (Exception var3) {
                }

                TelaJogo.this.bJogar.setBackground(Color.WHITE);
                TelaJogo.this.bJogar.setForeground(Color.RED);
            }
        });
        this.bMedio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TelaJogo.this.dif.setTempo(800);
                TelaJogo.this.dif.setNome("Médio");
                TelaJogo.this.dif.setID(2);
                TelaJogo.this.J.setDificuldade(TelaJogo.this.dif);
                TelaJogo.this.bJogar.setEnabled(true);
                JOptionPane.showMessageDialog((Component)null, "Nível de jogo selecionado para: Médio");
                TelaJogo.this.bJogar.setBackground(Color.RED);
                TelaJogo.this.bJogar.setForeground(Color.WHITE);

                try {
                    TelaJogo.this.update(TelaJogo.this.getGraphics());
                    Thread.sleep(500L);
                } catch (Exception var3) {
                }

                TelaJogo.this.bJogar.setBackground(Color.WHITE);
                TelaJogo.this.bJogar.setForeground(Color.RED);
            }
        });
        this.bDificil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TelaJogo.this.dif.setTempo(600);
                TelaJogo.this.dif.setNome("Díficil");
                TelaJogo.this.dif.setID(3);
                TelaJogo.this.J.setDificuldade(TelaJogo.this.dif);
                TelaJogo.this.bJogar.setEnabled(true);
                JOptionPane.showMessageDialog((Component)null, "Nível de jogo selecionado para: Difícil");
                TelaJogo.this.bJogar.setBackground(Color.RED);
                TelaJogo.this.bJogar.setForeground(Color.WHITE);

                try {
                    TelaJogo.this.update(TelaJogo.this.getGraphics());
                    Thread.sleep(500L);
                } catch (Exception var3) {
                }

                TelaJogo.this.bJogar.setBackground(Color.WHITE);
                TelaJogo.this.bJogar.setForeground(Color.RED);
            }
        });
        this.bSuperDificil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TelaJogo.this.dif.setTempo(300);
                TelaJogo.this.dif.setNome("Super Difícil");
                TelaJogo.this.dif.setID(4);
                TelaJogo.this.J.setDificuldade(TelaJogo.this.dif);
                TelaJogo.this.bJogar.setEnabled(true);
                JOptionPane.showMessageDialog((Component)null, "Nível de jogo selecionado para: Super Dificil");
                TelaJogo.this.bJogar.setBackground(Color.RED);
                TelaJogo.this.bJogar.setForeground(Color.WHITE);

                try {
                    TelaJogo.this.update(TelaJogo.this.getGraphics());
                    Thread.sleep(500L);
                } catch (Exception var3) {
                }

                TelaJogo.this.bJogar.setBackground(Color.WHITE);
                TelaJogo.this.bJogar.setForeground(Color.RED);
            }
        });
    }

    public void piscar() throws InterruptedException {
        for(int i = 0; i < this.J.getJogada_Jogo().size(); ++i) {
            if ((Integer)this.J.getJogada_Jogo().get(i) == 0) {
                this.bAmarelo.setBackground(Color.YELLOW);
                this.bAmarelo.setForeground(Color.WHITE);

                try {
                    this.update(this.getGraphics());
                    Thread.sleep((long)this.J.getDificuldade().getTempo());
                } catch (Exception var3) {
                }

                this.bAmarelo.setBackground(Color.WHITE);
                this.bAmarelo.setForeground(Color.YELLOW);
                this.update(this.getGraphics());
                Thread.sleep((long)this.J.getDificuldade().getTempo());
            } else if ((Integer)this.J.getJogada_Jogo().get(i) == 1) {
                this.bVerde.setBackground(Color.GREEN);
                this.bVerde.setForeground(Color.WHITE);

                try {
                    this.update(this.getGraphics());
                    Thread.sleep((long)this.J.getDificuldade().getTempo());
                } catch (Exception var6) {
                }

                this.bVerde.setBackground(Color.WHITE);
                this.bVerde.setForeground(Color.GREEN);
                this.update(this.getGraphics());
                Thread.sleep((long)this.J.getDificuldade().getTempo());
            } else if ((Integer)this.J.getJogada_Jogo().get(i) == 2) {
                this.bAzul.setBackground(Color.BLUE);
                this.bAzul.setForeground(Color.WHITE);

                try {
                    this.update(this.getGraphics());
                    Thread.sleep((long)this.J.getDificuldade().getTempo());
                } catch (Exception var5) {
                }

                this.bAzul.setBackground(Color.WHITE);
                this.bAzul.setForeground(Color.BLUE);
                this.update(this.getGraphics());
                Thread.sleep((long)this.J.getDificuldade().getTempo());
            } else if ((Integer)this.J.getJogada_Jogo().get(i) == 3) {
                this.bVermelho.setBackground(Color.RED);
                this.bVermelho.setForeground(Color.WHITE);

                try {
                    this.update(this.getGraphics());
                    Thread.sleep((long)this.J.getDificuldade().getTempo());
                } catch (Exception var4) {
                }

                this.bVermelho.setBackground(Color.WHITE);
                this.bVermelho.setForeground(Color.RED);
                this.update(this.getGraphics());
                Thread.sleep((long)this.J.getDificuldade().getTempo());
            }
        }

    }

    public void ResetPiscar() {
        if (this.J.getContinua() == 1) {
            JOptionPane.showMessageDialog((Component)null, "Acertou, próxima jogada");
            this.J.setContinua(0);
            this.label_pontos.setText(Integer.toString(this.J.getPontos()));

            try {
                this.piscar();
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }
        }

    }

    public void Mensagem() {
        Boolean res = this.J.verifica();
        if (!res) {
            JOptionPane.showMessageDialog((Component)null, "Jogada errada, salve sua pontuação");
            this.bRepetir.setEnabled(false);
        }

    }
}