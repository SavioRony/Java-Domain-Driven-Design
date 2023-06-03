package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AlunoTest {
    private Aluno joao;
    @BeforeEach
    void setup(){
        FabricaDeAluno fabricaDeAluno = new FabricaDeAluno();
        joao = fabricaDeAluno.comNomeCPFEmail("Joao", "456.887.958-24", "joao@mail.com").criar();
    }
    @Test
    void deveriaAdicionarUmTelefone() {
        joao.adicionarTelefone("11", "987654321");
        assertEquals(1, joao.getTelefones().size());
    }
    @Test
    void deveriaAdicionarDoisTelefone() {
        joao.adicionarTelefone("11", "987654321");
        joao.adicionarTelefone("11", "987654322");
        assertEquals(2, joao.getTelefones().size());
    }
    @Test
    void deveriaRetornaExcecaoDeTelefoneMaximo() {
        joao.adicionarTelefone("11", "987654321");
        joao.adicionarTelefone("11", "987654322");
        assertThrows(QuantidadeMaximaTelefone.class, () -> joao.adicionarTelefone("11", "987654323"));
    }
}