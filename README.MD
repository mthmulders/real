# Real

Build status: [![Circle CI](https://circleci.com/gh/mthmulders/real/tree/master.svg?style=svg)](https://circleci.com/gh/mthmulders/real/tree/master)

Code quality: [![Codacy Badge](https://api.codacy.com/project/badge/grade/cb7e21bd6f5549f08725bbaa05b35e85)](https://www.codacy.com/app/mthmulders/real)

## What is it?
t.b.d.

## Deploying
You can deploy this application to a variety of platforms. Some are described below.

### OpenShift Online

- Create an application as described [here](https://github.com/Skamander/openshift-scaled-play2-cartridge).
- Build using `sbt clean universal:packageZipTarball`
- Deploy using `rhc deploy -a replaceMeWithTheNameForYourApp path/to/your/application/target/universal/yourApp.tgz`

## Contributing
t.b.d.


failed to run command `/var/lib/openshift/570114b72d5271e651000145/app-root/runtime/repo/bin/': No such file or directory
