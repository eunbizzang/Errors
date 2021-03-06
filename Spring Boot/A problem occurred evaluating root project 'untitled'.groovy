Error

build.gradle을 설정할 때 발생함

원인 :  compile('org.springframework.boot:spring-boot-starter-web')
    compile('org.projectlombok:lombok')
    compile('org.springframework.boot:spring-boot-starter-data-jpa')
    compile('org.springframework.boot:spring-boot-starter-mustache')
    compile('com.h2database:h2')

    compile('org.springframework.boot:spring-boot-starter-oauth2-client')
    compile('org.springframework.session:spring-session-jdbc')

    compile("org.mariadb.jdbc:mariadb-java-client")

    testCompile('org.springframework.boot:spring-boot-starter-test')
    testCompile("org.springframework.security:spring-security-test")

    이 아닌

    implementation('org.springframework.boot:spring-boot-starter-web')
    implementation('org.projectlombok:lombok')
    implementation('org.springframework.boot:spring-boot-starter-data-jpa')
    implementation('org.springframework.boot:spring-boot-starter-mustache')
    implementation('com.h2database:h2')

    implementation('org.springframework.boot:spring-boot-starter-oauth2-client')
    implementation('org.springframework.session:spring-session-jdbc')

    implementation("org.mariadb.jdbc:mariadb-java-client")

    testImplementation('org.springframework.boot:spring-boot-starter-test')
    testImplementation("org.springframework.security:spring-security-test") 로 설정

Build file 'C:\Users\Documents\untitled\build.gradle' line: 29

A problem occurred evaluating root project 'untitled'.
> Could not find method implementataion() for arguments [org.springframework.boot:spring-boot-starter-web] on object of type org.gradle.api.internal.artifacts.dsl.dependencies.DefaultDependencyHandler.

* Try:
Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Exception is:
org.gradle.api.GradleScriptException: A problem occurred evaluating root project 'untitled'.
	at org.gradle.groovy.scripts.internal.DefaultScriptRunnerFactory$ScriptRunnerImpl.run(DefaultScriptRunnerFactory.java:93)
	at org.gradle.configuration.DefaultScriptPluginFactory$ScriptPluginImpl.lambda$apply$0(DefaultScriptPluginFactory.java:133)
	at org.gradle.configuration.ProjectScriptTarget.addConfiguration(ProjectScriptTarget.java:77)
	at org.gradle.configuration.DefaultScriptPluginFactory$ScriptPluginImpl.apply(DefaultScriptPluginFactory.java:136)
	at org.gradle.configuration.BuildOperationScriptPlugin$1.run(BuildOperationScriptPlugin.java:65)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:75)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:153)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:56)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.lambda$run$1(DefaultBuildOperationExecutor.java:74)
	at org.gradle.internal.operations.UnmanagedBuildOperationWrapper.runWithUnmanagedSupport(UnmanagedBuildOperationWrapper.java:45)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:74)
	at org.gradle.configuration.BuildOperationScriptPlugin.lambda$apply$0(BuildOperationScriptPlugin.java:62)
	at org.gradle.configuration.internal.DefaultUserCodeApplicationContext.apply(DefaultUserCodeApplicationContext.java:44)
	at org.gradle.configuration.BuildOperationScriptPlugin.apply(BuildOperationScriptPlugin.java:62)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.lambda$applyToMutableState$0(DefaultProjectStateRegistry.java:280)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.fromMutableState(DefaultProjectStateRegistry.java:307)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.applyToMutableState(DefaultProjectStateRegistry.java:279)
	at org.gradle.configuration.project.BuildScriptProcessor.execute(BuildScriptProcessor.java:42)
	at org.gradle.configuration.project.BuildScriptProcessor.execute(BuildScriptProcessor.java:26)
	at org.gradle.configuration.project.ConfigureActionsProjectEvaluator.evaluate(ConfigureActionsProjectEvaluator.java:35)
	at org.gradle.configuration.project.LifecycleProjectEvaluator$EvaluateProject.lambda$run$0(LifecycleProjectEvaluator.java:100)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.lambda$applyToMutableState$0(DefaultProjectStateRegistry.java:280)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.lambda$withProjectLock$3(DefaultProjectStateRegistry.java:340)
	at org.gradle.internal.work.DefaultWorkerLeaseService.withLocks(DefaultWorkerLeaseService.java:213)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.withProjectLock(DefaultProjectStateRegistry.java:340)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.fromMutableState(DefaultProjectStateRegistry.java:321)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.applyToMutableState(DefaultProjectStateRegistry.java:279)
	at org.gradle.configuration.project.LifecycleProjectEvaluator$EvaluateProject.run(LifecycleProjectEvaluator.java:91)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:75)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:153)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:56)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.lambda$run$1(DefaultBuildOperationExecutor.java:74)
	at org.gradle.internal.operations.UnmanagedBuildOperationWrapper.runWithUnmanagedSupport(UnmanagedBuildOperationWrapper.java:45)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:74)
	at org.gradle.configuration.project.LifecycleProjectEvaluator.evaluate(LifecycleProjectEvaluator.java:63)
	at org.gradle.api.internal.project.DefaultProject.evaluate(DefaultProject.java:741)
	at org.gradle.api.internal.project.DefaultProject.evaluate(DefaultProject.java:149)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.ensureConfigured(DefaultProjectStateRegistry.java:253)
	at org.gradle.execution.TaskPathProjectEvaluator.configure(TaskPathProjectEvaluator.java:41)
	at org.gradle.execution.TaskPathProjectEvaluator.configureHierarchy(TaskPathProjectEvaluator.java:55)
	at org.gradle.configuration.DefaultProjectsPreparer.prepareProjects(DefaultProjectsPreparer.java:50)
	at org.gradle.configuration.BuildTreePreparingProjectsPreparer.prepareProjects(BuildTreePreparingProjectsPreparer.java:64)
	at org.gradle.configuration.BuildOperationFiringProjectsPreparer$ConfigureBuild.run(BuildOperationFiringProjectsPreparer.java:52)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:75)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:153)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:56)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.lambda$run$1(DefaultBuildOperationExecutor.java:74)
	at org.gradle.internal.operations.UnmanagedBuildOperationWrapper.runWithUnmanagedSupport(UnmanagedBuildOperationWrapper.java:45)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:74)
	at org.gradle.configuration.BuildOperationFiringProjectsPreparer.prepareProjects(BuildOperationFiringProjectsPreparer.java:40)
	at org.gradle.initialization.VintageBuildModelController.prepareProjects(VintageBuildModelController.java:85)
	at org.gradle.initialization.VintageBuildModelController.doBuildStages(VintageBuildModelController.java:69)
	at org.gradle.initialization.VintageBuildModelController.scheduleRequestedTasks(VintageBuildModelController.java:61)
	at org.gradle.internal.build.DefaultBuildLifecycleController.lambda$scheduleRequestedTasks$1(DefaultBuildLifecycleController.java:112)
	at org.gradle.internal.build.DefaultBuildLifecycleController.withModel(DefaultBuildLifecycleController.java:134)
	at org.gradle.internal.build.DefaultBuildLifecycleController.scheduleRequestedTasks(DefaultBuildLifecycleController.java:110)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.lambda$fromBuildModel$2(DefaultBuildTreeLifecycleController.java:72)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.lambda$doBuild$4(DefaultBuildTreeLifecycleController.java:105)
	at org.gradle.internal.work.DefaultWorkerLeaseService.withLocks(DefaultWorkerLeaseService.java:213)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.doBuild(DefaultBuildTreeLifecycleController.java:99)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.fromBuildModel(DefaultBuildTreeLifecycleController.java:70)
	at org.gradle.tooling.internal.provider.runner.AbstractClientProvidedBuildActionRunner.runClientAction(AbstractClientProvidedBuildActionRunner.java:58)
	at org.gradle.tooling.internal.provider.runner.ClientProvidedPhasedActionRunner.run(ClientProvidedPhasedActionRunner.java:52)
	at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
	at org.gradle.internal.buildtree.ProblemReportingBuildActionRunner.run(ProblemReportingBuildActionRunner.java:50)
	at org.gradle.launcher.exec.BuildOutcomeReportingBuildActionRunner.run(BuildOutcomeReportingBuildActionRunner.java:69)
	at org.gradle.tooling.internal.provider.FileSystemWatchingBuildActionRunner.run(FileSystemWatchingBuildActionRunner.java:90)
	at org.gradle.launcher.exec.BuildCompletionNotifyingBuildActionRunner.run(BuildCompletionNotifyingBuildActionRunner.java:41)
	at org.gradle.launcher.exec.RootBuildLifecycleBuildActionExecutor.lambda$execute$0(RootBuildLifecycleBuildActionExecutor.java:40)
	at org.gradle.composite.internal.DefaultRootBuildState.run(DefaultRootBuildState.java:128)
	at org.gradle.launcher.exec.RootBuildLifecycleBuildActionExecutor.execute(RootBuildLifecycleBuildActionExecutor.java:40)
	at org.gradle.internal.buildtree.DefaultBuildTreeContext.execute(DefaultBuildTreeContext.java:40)
	at org.gradle.launcher.exec.BuildTreeLifecycleBuildActionExecutor.lambda$execute$0(BuildTreeLifecycleBuildActionExecutor.java:40)
	at org.gradle.internal.buildtree.BuildTreeState.run(BuildTreeState.java:53)
	at org.gradle.launcher.exec.BuildTreeLifecycleBuildActionExecutor.execute(BuildTreeLifecycleBuildActionExecutor.java:40)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor$3.call(RunAsBuildOperationBuildActionExecutor.java:61)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor$3.call(RunAsBuildOperationBuildActionExecutor.java:57)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:200)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:195)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:75)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:153)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:62)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.lambda$call$2(DefaultBuildOperationExecutor.java:79)
	at org.gradle.internal.operations.UnmanagedBuildOperationWrapper.callWithUnmanagedSupport(UnmanagedBuildOperationWrapper.java:54)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:79)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor.execute(RunAsBuildOperationBuildActionExecutor.java:57)
	at org.gradle.tooling.internal.provider.ContinuousBuildActionExecutor.execute(ContinuousBuildActionExecutor.java:103)
	at org.gradle.tooling.internal.provider.SubscribableBuildActionExecutor.execute(SubscribableBuildActionExecutor.java:64)
	at org.gradle.internal.session.DefaultBuildSessionContext.execute(DefaultBuildSessionContext.java:46)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter.lambda$execute$0(BuildSessionLifecycleBuildActionExecuter.java:55)
	at org.gradle.internal.session.BuildSessionState.run(BuildSessionState.java:69)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter.execute(BuildSessionLifecycleBuildActionExecuter.java:54)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter.execute(BuildSessionLifecycleBuildActionExecuter.java:36)
	at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:36)
	at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:25)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:63)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:31)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:58)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:42)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:47)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:31)
	at org.gradle.launcher.daemon.server.exec.ExecuteBuild.doBuild(ExecuteBuild.java:65)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.WatchForDisconnection.execute(WatchForDisconnection.java:39)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ResetDeprecationLogger.execute(ResetDeprecationLogger.java:29)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.RequestStopIfSingleUsedDaemon.execute(RequestStopIfSingleUsedDaemon.java:35)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:78)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:75)
	at org.gradle.util.internal.Swapper.swap(Swapper.java:38)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput.execute(ForwardClientInput.java:75)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogAndCheckHealth.execute(LogAndCheckHealth.java:55)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogToClient.doBuild(LogToClient.java:63)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.EstablishBuildEnvironment.doBuild(EstablishBuildEnvironment.java:84)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.StartBuildOrRespondWithBusy$1.run(StartBuildOrRespondWithBusy.java:52)
	at org.gradle.launcher.daemon.server.DaemonStateCoordinator$1.run(DaemonStateCoordinator.java:297)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:56)
Caused by: org.gradle.internal.metaobject.AbstractDynamicObject$CustomMessageMissingMethodException: Could not find method implementataion() for arguments [org.springframework.boot:spring-boot-starter-web] on object of type org.gradle.api.internal.artifacts.dsl.dependencies.DefaultDependencyHandler.
	at org.gradle.internal.metaobject.AbstractDynamicObject$CustomMissingMethodExecutionFailed.<init>(AbstractDynamicObject.java:190)
	at org.gradle.internal.metaobject.AbstractDynamicObject.methodMissingException(AbstractDynamicObject.java:184)
	at org.gradle.internal.metaobject.ConfigureDelegate.invokeMethod(ConfigureDelegate.java:86)
	at build_b0y6gaazuu3icfzh32o89p126$_run_closure2.doCall(C:\Users\Documents\untitled\build.gradle:29)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at org.gradle.util.internal.ClosureBackedAction.execute(ClosureBackedAction.java:72)
	at org.gradle.util.internal.ConfigureUtil.configureTarget(ConfigureUtil.java:155)
	at org.gradle.util.internal.ConfigureUtil.configure(ConfigureUtil.java:106)
	at org.gradle.api.internal.project.DefaultProject.dependencies(DefaultProject.java:1227)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at org.gradle.internal.metaobject.BeanDynamicObject$MetaClassAdapter.invokeMethod(BeanDynamicObject.java:484)
	at org.gradle.internal.metaobject.BeanDynamicObject.tryInvokeMethod(BeanDynamicObject.java:196)
	at org.gradle.internal.metaobject.CompositeDynamicObject.tryInvokeMethod(CompositeDynamicObject.java:98)
	at org.gradle.internal.extensibility.MixInClosurePropertiesAsMethodsDynamicObject.tryInvokeMethod(MixInClosurePropertiesAsMethodsDynamicObject.java:34)
	at org.gradle.groovy.scripts.BasicScript$ScriptDynamicObject.tryInvokeMethod(BasicScript.java:135)
	at org.gradle.internal.metaobject.AbstractDynamicObject.invokeMethod(AbstractDynamicObject.java:163)
	at org.gradle.groovy.scripts.BasicScript.invokeMethod(BasicScript.java:84)
	at build_b0y6gaazuu3icfzh32o89p126.run(C:\Users\Documents\untitled\build.gradle:28)
	at org.gradle.groovy.scripts.internal.DefaultScriptRunnerFactory$ScriptRunnerImpl.run(DefaultScriptRunnerFactory.java:91)
	... 141 more
