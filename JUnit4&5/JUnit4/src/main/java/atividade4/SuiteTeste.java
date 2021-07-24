package atividade4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import atividade2.Validacao1;
import atividade2.Validacao2;
import atividade2.Validacao3;

@RunWith(Suite.class)
@SuiteClasses({Validacao1.class, Validacao2.class, Validacao3.class})

public class SuiteTeste {

}
