package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @param nome
	 * @return Var
	 */
	// Bloco
	public static Var Executar(Var Entidade, Var nome) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf("vars.input4718"), Var.valueOf("Neri"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
