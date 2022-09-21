package model;

public class Aluno {
    private String nomeCompleto;
    private String nomeCurso;
    private int matriculaAluno;
    private String email;

    public Aluno() {
    }

    public Aluno(String nomeCompleto, String nomeCurso, int matriculaAluno, String email) {
        this.nomeCompleto = nomeCompleto;
        this.nomeCurso = nomeCurso;
        this.matriculaAluno = matriculaAluno;
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome Completo: " + nomeCompleto + " / Nome Curso: " + nomeCurso + " / Matricula Aluno: " + matriculaAluno + " / Email: " + email+"\n";
    }
}
