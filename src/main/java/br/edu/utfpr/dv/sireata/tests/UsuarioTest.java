package test;

import static org.junit.Assert.assertEquals;

import br.edu.utfpr.dv.sireata.model.Usuario;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class UsuarioTest {

  private static Usuario usuario;

  @BeforeClass
  public static void setup() {
   usuario.setSenha("123456");
   usuario.setEmail("alvaro@gmail.com");
   usuario.setNome("Alvaro");
  }

  @Test
  public void testName() {
    assertEquals("Alvaro", usuario.getNome());
  }

  @Test
  public void testEmail() {
    assertEquals("alvaro@gmail.com", usuario.getEmail());
  }

  @Test
  public void testPassword() {
    assertEquals("123456", usuario.getSenha());
  }
}