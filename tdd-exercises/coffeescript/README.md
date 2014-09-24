Prerequisites:

Use the one off coffeescript-setup.sh (assumes brew) OR:

- brew (http://brew.sh/)
- npm (brew install node)
- bower (npm install -g bower)
- grunt-cli (npm install -g grunt-cli)

Then in EACH REPO:

- install depencies with 'npm install && bower install'
- run the tests with 'grunt test --force'.

The tests will open in your browser and autoreload on changes to files in the scripts directory.