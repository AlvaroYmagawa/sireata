import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CultureMachineTestCases{
 
  @Test
  public void testAnexo() {
    Anexo anexo = new Anexo();

    anexo.setDescricao("Lorem ipsum dolor sit amet,
    consectetur adipiscing elit, sed do eiusmod tempor incididunt
    ut labore et dolore magna aliqua");

    String name = anexo.getDescricao();

    assertEquals("Lorem ipsum dolor sit amet,
    consectetur adipiscing elit, sed do eiusmod tempor incididunt
    ut labore et dolore magna aliqua", name);
  }
}