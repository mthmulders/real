# Real

Build status: [![Circle CI](https://circleci.com/gh/mthmulders/real/tree/master.svg?style=svg)](https://circleci.com/gh/mthmulders/real/tree/master)

Code quality: [![Codacy Badge](https://api.codacy.com/project/badge/grade/a8ce535fb85745eb8df8bfb92025ac5c)](https://www.codacy.com/app/mthmulders/real)

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
