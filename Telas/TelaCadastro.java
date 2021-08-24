package Telas;

import Classes.Jogador;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCadastro extends JFrame {
    private JPanel jpn = new JPanel();
    private JTextField txtNome = new JTextField();
    private JTextField txtSobrenome = new JTextField();
    private JTextField txtAvatar = new JTextField();
    private JPasswordField txtSenha = new JPasswordField();
    private JButton bVoltar = new JButton("VOLTAR");
    private JButton bSalvar = new JButton("SALVAR");
    private JLabel lblNome = new JLabel("Nome");
    private JLabel lblSobrenome = new JLabel("Sobrenome");
    private JLabel lblAvatar = new JLabel("Avatar");
    private JLabel lblSenha = new JLabel("Senha");
    Jogador user = new Jogador();

    public TelaCadastro() {
        super("Jenius - Um jogo qualquer");
        this.jpn.setBackground(new Color(47, 79, 79));
        this.lblNome.setForeground(new Color(255, 255, 255));
        this.lblSobrenome.setForeground(new Color(255, 255, 255));
        this.lblAvatar.setForeground(new Color(255, 255, 255));
        this.lblSenha.setForeground(new Color(255, 255, 255));
        this.bSalvar.setForeground(Color.BLACK);
        this.bSalvar.setBackground(new Color(255, 215, 0));
        this.bVoltar.setForeground(Color.BLACK);
        this.bVoltar.setBackground(new Color(255, 215, 0));
        this.jpn.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.lblNome.setBounds(167, 86, 100, 22);
        this.lblSobrenome.setBounds(167, 135, 155, 27);
        this.lblAvatar.setBounds(167, 173, 90, 45);
        this.lblSenha.setBounds(162, 219, 83, 45);
        this.bVoltar.setBounds(199, 293, 123, 55);
        this.bSalvar.setBounds(371, 293, 123, 55);
        this.txtNome.setBounds(364, 87, 141, 33);
        this.txtNome.setColumns(10);
        this.txtSobrenome.setColumns(10);
        this.txtSobrenome.setBounds(364, 135, 141, 33);
        this.txtAvatar.setColumns(10);
        this.txtAvatar.setBounds(364, 185, 141, 33);
        this.txtSenha.setBounds(364, 231, 141, 33);
        this.lblNome.setFont(new Font("Microsoft YaHei", 1, 24));
        this.lblSobrenome.setFont(new Font("Microsoft YaHei", 1, 24));
        this.lblAvatar.setFont(new Font("Microsoft YaHei", 1, 24));
        this.lblSenha.setFont(new Font("Microsoft YaHei", 1, 24));
        this.setContentPane(this.jpn);
        this.jpn.setLayout((LayoutManager)null);
        this.jpn.add(this.lblNome);
        this.jpn.add(this.lblSobrenome);
        this.jpn.add(this.lblAvatar);
        this.jpn.add(this.lblSenha);
        this.jpn.add(this.bVoltar);
        this.jpn.add(this.bSalvar);
        this.jpn.add(this.txtNome);
        this.jpn.add(this.txtSobrenome);
        this.jpn.add(this.txtAvatar);
        this.jpn.add(this.txtSenha);
        this.setDefaultCloseOperation(3);
        this.setSize(640, 480);
        this.bSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Jogador user = new Jogador();
                user.setNome(TelaCadastro.this.txtNome.getText());
                user.setSenha(TelaCadastro.this.txtSenha.getText());
                user.setUsuario(TelaCadastro.this.txtAvatar.getText());
                TelaCadastro.this.txtNome.setText("");
                TelaCadastro.this.txtSenha.setText("");
                TelaCadastro.this.txtAvatar.setText("");
                TelaCadastro.this.txtSobrenome.setText("");
                Boolean res = user.verificaAvatar();
                if (res) {
                    JOptionPane.showMessageDialog((Component)null, "Cadastro feito com sucesso :)");
                    TelaCadastro.this.dispose();
                    TelaPrincipal Tela = new TelaPrincipal();
                    Tela.setDefaultCloseOperation(3);
                    Tela.setSize(640, 480);
                    Tela.setResizable(false);
                    Tela.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Avatar já existe, faça outro :)");
                }

            }
        });
        this.bSalvar.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaCadastro.this.bSalvar.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaCadastro.this.bSalvar.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaCadastro.this.bSalvar.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaCadastro.this.bSalvar.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaCadastro.this.bSalvar.setBackground(Color.YELLOW);
            }
        });
        this.bVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastro.this.dispose();
                TelaPrincipal Tela = new TelaPrincipal();
                Tela.setDefaultCloseOperation(3);
                Tela.setSize(640, 480);
                Tela.setResizable(false);
                Tela.setVisible(true);
            }
        });
        this.bVoltar.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent e) {
                TelaCadastro.this.bVoltar.setBackground(new Color(255, 215, 0));
            }

            public void mouseClicked(MouseEvent e) {
                TelaCadastro.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mousePressed(MouseEvent e) {
                TelaCadastro.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseReleased(MouseEvent e) {
                TelaCadastro.this.bVoltar.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                TelaCadastro.this.bVoltar.setBackground(Color.YELLOW);
            }
        });
    }
}
