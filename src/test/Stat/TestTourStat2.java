

package Stat;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.evosuite.shaded.org.mockito.Mockito.mock;

@EvoSuiteClassExclude
public class TestTourStat2 {

    private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone();
    @org.junit.Rule
    public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
    private org.evosuite.runtime.thread.ThreadStopper threadStopper = new org.evosuite.runtime.thread.ThreadStopper(org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


    @BeforeClass
    public static void initEvoSuiteFramework() {
        org.evosuite.runtime.RuntimeSettings.className = "Stat.TourStat";
        org.evosuite.runtime.GuiSupport.initialize();
        org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100;
        org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        org.evosuite.runtime.RuntimeSettings.mockSystemIn = true;
        org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
        org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT();
        org.evosuite.runtime.classhandling.JDKClassResetter.init();
        setSystemProperties();
        initializeClasses();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime();
        try {
            initMocksToAvoidTimeoutsInTheTests();
        } catch (ClassNotFoundException e) {
        }
    }

    @AfterClass
    public static void clearEvoSuiteFramework() {
        Sandbox.resetDefaultSecurityManager();
        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
    }

    public static void setSystemProperties() {

        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
        java.lang.System.setProperty("file.encoding", "UTF-8");
        java.lang.System.setProperty("java.awt.headless", "true");
        java.lang.System.setProperty("java.io.tmpdir", "/var/folders/66/43ls8qhd40zgxd4nt9mwyhg40000gr/T/");
        java.lang.System.setProperty("user.country", "FR");
        java.lang.System.setProperty("user.dir", "/Users/hide/Desktop/DFe");
        java.lang.System.setProperty("user.home", "/Users/hide");
        java.lang.System.setProperty("user.language", "fr");
        java.lang.System.setProperty("user.name", "hide");
        java.lang.System.setProperty("user.timezone", "Europe/Paris");
    }

    private static void initializeClasses() {
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TestTourStat2.class.getClassLoader(),
                "De.Face",
                "Bot.Joueur",
                "De.De",
                "De.Ressource",
                "Stat.TourStat",
                "Bot.Inventaire"
        );
    }

    private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException {
        mock(Class.forName("Bot.Inventaire", false, TestTourStat2.class.getClassLoader()));
        mock(Class.forName("Bot.Joueur", false, TestTourStat2.class.getClassLoader()));
        mock(Class.forName("De.De", false, TestTourStat2.class.getClassLoader()));
        mock(Class.forName("De.Face", false, TestTourStat2.class.getClassLoader()));
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TestTourStat2.class.getClassLoader());

        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
                "Bot.Joueur",
                "De.De",
                "De.Face",
                "De.Ressource",
                "Bot.Inventaire",
                "Stat.TourStat"
        );
    }

    @Before
    public void initTestCase() {
        threadStopper.storeCurrentThreads();
        threadStopper.startRecordingTime();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler();
        org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode();
        setSystemProperties();
        org.evosuite.runtime.GuiSupport.setHeadless();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime();
        org.evosuite.runtime.agent.InstrumentingAgent.activate();
    }

    @After
    public void doneWithTestCase() {
        threadStopper.killAndJoinClientThreads();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks();
        org.evosuite.runtime.classhandling.JDKClassResetter.reset();
        resetClasses();
        org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode();
        org.evosuite.runtime.agent.InstrumentingAgent.deactivate();
        org.evosuite.runtime.GuiSupport.restoreHeadlessMode();
    }
}
