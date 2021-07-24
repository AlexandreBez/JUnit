package atividade4;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import atividade2.Validacao1;
import atividade2.Validacao2;
import atividade2.Validacao3;

@RunWith(Categories.class)
@IncludeCategory(ISmoke.class)
@ExcludeCategory(IRegressivo.class)
@SuiteClasses({Validacao1.class, Validacao2.class, Validacao3.class})

public class SuiteTeste2 {

}
