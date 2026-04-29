package com.wipro.suites;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AdditionTest.class, SubtractionTest.class})
//@IncludeTags({"Development","Production"})
//@ExcludeTags("t1")

@IncludeTags({"t1"})
public class TestSuites {

}
