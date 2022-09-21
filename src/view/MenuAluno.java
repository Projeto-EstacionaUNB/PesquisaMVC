package view;
import controller.AlunoController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuAluno extends JFrame{

    JLabel lblName;
    JTextField txtNome,txtCurso,txtMatricula,txtEmail;
    LayoutManager manager;

    JButton btnSalvar, btnSair;
    AlunoController alunosC = new AlunoController();
    public MenuAluno() {
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        manager = new GridLayout(5,4);
        setLayout(manager);

        // CADASTRO NOME ALUNO

        lblName = new JLabel("Nome Aluno: ");
        lblName.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,12));
        add(lblName);
        txtNome = new JTextField();
        add(txtNome);

        // CADASTRO CURSO ALUNO

        lblName = new JLabel("Nome do Curso : ");
        lblName.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,12));
        add(lblName);
        txtCurso = new JTextField();
        add(txtCurso);

        // CADASTRO MATRICULA

        lblName = new JLabel("Matricula Aluno: ");
        lblName.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,12));
        add(lblName);
        txtMatricula = new JTextField();
        add(txtMatricula);

        // CADASTRO EMAIL ALUNO

        lblName = new JLabel("Email Aluno: ");
        lblName.setFont(new Font(Font.SANS_SERIF, Font.ITALIC,12));
        add(lblName);
        txtEmail = new JTextField();
        add(txtEmail);

        //Salvar Informações

        btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String texto = txtNome.getText();
                String nomeCurso = txtCurso.getText();
                int matricula = Integer.parseInt(txtMatricula.getText());
                String email = txtEmail.getText();

                try {
                    if(alunosC.guardaAluno(texto,nomeCurso,matricula,email)){
                        JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(btnSalvar);

        // Sair da Pagina

        btnSair = new JButton("Sair");
        btnSair.addActionListener(actionEvent -> {
           JOptionPane.showMessageDialog(null,"Fechando Cadastro Aluno");
           dispose();
        });

        add(btnSair);
        setVisible(true);
    }
}
