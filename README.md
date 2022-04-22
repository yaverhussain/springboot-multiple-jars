# Purpose

Sometimes when you write an application in springboot, in addition to this being an executable you might also want to use it as a dependency in another project. 

By default Maven packages the application as jar (or war etc). Those JARS are non executable and though they can be used in other projects as dependency they cannot be executed. With Springboot, we introduce a new plugin that enables us to bundle that jar into another executable jar (called fat jar)

```
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-maven-plugin</artifactId>
```

By default, the plugin will simply overwrite the thin jar created earlier with the one that now is executable jar. Now since we have executable jar that we can run & deploy as application we cannot use this jar as dependency in another project. To achieve that we need to keep the thin jar that can be used as dependency in addition to creating the executable jar. This can be achieved if we can somehow let the plugin know to create the executable jar with some suffix so it has a different name. Below snippet will enable that for plugin 

```
<executions>
	<execution>
		<goals>
			<goal>repackage</goal>
		</goals>
		<configuration>
			<classifier>exec</classifier>
		</configuration>
	</execution>
</executions>
```

See [pom.xml](pom.xml) here			



