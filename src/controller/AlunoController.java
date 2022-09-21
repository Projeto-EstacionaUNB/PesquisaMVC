package controller;

import model.Aluno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    public AlunoController() {
    }

    public boolean guardaAluno(String nomeCompleto, String nomeCurso, int matriculaAluno, String email) throws IOException {
        Aluno x = new Aluno(nomeCompleto, nomeCurso,matriculaAluno,email);

        alunos.add(x);

        if(x == null){
            return false;
        }else{
            x.salvaAluno();
            return  true;
        }
    }

    public String[] listaAlunos() throws IOException {
        FileReader lerar = new FileReader("leitura.txt");
        int data = lerar.read();
        String dados = null;
        boolean isFirst = true;

        while (data != -1){
            if(isFirst){
                dados = String.valueOf((char)data);
                data = lerar.read();
                isFirst =false;
            }else{
                dados += String.valueOf((char)data);
                data = lerar.read();
            }
        }
        lerar.close();

        return dados.split("\n");
    }

    @Override
    public String toString() {
        return "Lista de Alunos: " + alunos;
    }
}
