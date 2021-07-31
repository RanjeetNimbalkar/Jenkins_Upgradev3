job('First_Maven_Project_DSL')
{
	description("First Maven job generated by the DSL on ${new Date()}, the project is a small Maven hosted on github")
	scm{
		github('https://github.com/RanjeetNimbalkar/Jenkins_Upgradev3.git', 'master')
	}
	triggers{
		scm('* * * * *')
	}
	step {
		maven('clean, package', 'java-tomcat-sample/pom.xml')
		
	}
	publishers{
		archiveArtifacts '**/*.jar'
	}
}
