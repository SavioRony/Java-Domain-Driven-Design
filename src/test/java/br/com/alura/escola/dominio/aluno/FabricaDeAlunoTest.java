package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FabricaDeAlunoTest {


    /**
     * Method under test: {@link FabricaDeAluno#comNomeCPFEmail(String, String, String)}
     */
    @Test
    void testComNomeCPFEmail3() {
        FabricaDeAluno fabricaDeAluno = new FabricaDeAluno();
        FabricaDeAluno actualComNomeCPFEmailResult = fabricaDeAluno.comNomeCPFEmail("Nome", "999.999.999-99",
                "jane.doe@example.org");
        assertSame(fabricaDeAluno, actualComNomeCPFEmailResult);
        Aluno criarResult = actualComNomeCPFEmailResult.criar();
        assertEquals("999.999.999-99", criarResult.getCpf());
        assertTrue(criarResult.getTelefones().isEmpty());
        assertEquals("Nome", criarResult.getNome());
        assertEquals("jane.doe@example.org", criarResult.getEmail());
    }

    /**
     * Method under test: {@link FabricaDeAluno#comNomeCPFEmail(String, String, String)}
     */
    @Test
    void testComNomeCPFEmail4() {
        FabricaDeAluno fabricaDeAluno = new FabricaDeAluno();
        FabricaDeAluno actualComNomeCPFEmailResult = fabricaDeAluno.comNomeCPFEmail("Nome", "999.999.999-99",
                "john.smith@example.org");
        assertSame(fabricaDeAluno, actualComNomeCPFEmailResult);
        Aluno criarResult = actualComNomeCPFEmailResult.criar();
        assertEquals("999.999.999-99", criarResult.getCpf());
        assertTrue(criarResult.getTelefones().isEmpty());
        assertEquals("Nome", criarResult.getNome());
        assertEquals("john.smith@example.org", criarResult.getEmail());
    }

    /**
     * Method under test: {@link FabricaDeAluno#comNomeCPFEmail(String, String, String)}
     */
    @Test
    void testComNomeCPFEmail5() {
        FabricaDeAluno fabricaDeAluno = new FabricaDeAluno();
        FabricaDeAluno actualComNomeCPFEmailResult = fabricaDeAluno.comNomeCPFEmail("Nome", "999.999.999-99",
                "prof.einstein@example.org");
        assertSame(fabricaDeAluno, actualComNomeCPFEmailResult);
        Aluno criarResult = actualComNomeCPFEmailResult.criar();
        assertEquals("999.999.999-99", criarResult.getCpf());
        assertTrue(criarResult.getTelefones().isEmpty());
        assertEquals("Nome", criarResult.getNome());
        assertEquals("prof.einstein@example.org", criarResult.getEmail());
    }


    /**
     * Method under test: {@link FabricaDeAluno#comNomeCPFEmail(String, String, String)}
     */
    @Test
    void testComNomeCPFEmail7() {
        FabricaDeAluno fabricaDeAluno = new FabricaDeAluno();
        FabricaDeAluno actualComNomeCPFEmailResult = fabricaDeAluno.comNomeCPFEmail("Nome", "999.999.999-99", "U@U.UUUU");
        assertSame(fabricaDeAluno, actualComNomeCPFEmailResult);
        Aluno criarResult = actualComNomeCPFEmailResult.criar();
        assertEquals("999.999.999-99", criarResult.getCpf());
        assertTrue(criarResult.getTelefones().isEmpty());
        assertEquals("Nome", criarResult.getNome());
        assertEquals("U@U.UUUU", criarResult.getEmail());
    }
}

