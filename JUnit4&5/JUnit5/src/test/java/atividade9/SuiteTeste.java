package atividade9;

import org.junit.jupiter.api.Tag;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import atividade5.RepeteTeste;
import atividade8.MetodoNested;

@RunWith(JUnitPlatform.class)
@SelectPackages({"atividade5", "atividade8"})
//@IncludePackages("atividade8")
//@ExcludePackages("atividade8")
//@SelectClasses({RepeteTeste.class, MetodoNested.class})
//@IncludeClassNamePatterns("^.*SuiteA?$")
//@ExcludeClassNamePatterns("^.*SuiteA?$")
@IncludeTags("Teste1")
@ExcludeTags("Teste1")
public class SuiteTeste {
	
	
}
