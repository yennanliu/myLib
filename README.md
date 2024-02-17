# myLib

- Demo project deploy a simple java libaray to public space
	- Maven
	- Github

## Code structure

```
├── README.md
└── myLib
    ├── pom.xml
    ├── src
    │   ├── main
    │   └── test
```

## Deploy to maven

## Deploy to Github

- Step 1: setup `~/.m2/settings.xml `

- Step 2: deploy 
```bash
# copy below cmd, and run in IntellJ "maven input", then can deploy updated project to github maven
mvn clean deploy -Dmaven.test.skip  -DaltDeploymentRepository=self-mvn-repo::default::file:/Users/yennanliu/myLib/myLib
```

## Ref

- Maven
	- https://issues.sonatype.org/projects/MVNCENTRAL/issues/MVNCENTRAL-8606?filter=allissues
	- https://blog.csdn.net/wo541075754/article/details/107633976
	- https://www.linkedin.com/pulse/%E5%A5%97%E4%BB%B6%E7%AE%A1%E7%90%86-%E8%A3%BD%E4%BD%9C%E8%87%AA%E5%B7%B1%E7%9A%84%E7%99%BE%E5%AF%B6%E8%A2%8B%E5%90%A7-jimmy-yang/?originalSubdomain=cn
- Github
	- https://bingdoal.github.io/deploy/2021/01/build-maven-repo-on-github/
	- https://www.cnblogs.com/ukzq/p/11806894.html
	- https://zhuanlan.zhihu.com/p/600542438
	- https://docs.github.com/zh/actions/publishing-packages/publishing-java-packages-with-maven
