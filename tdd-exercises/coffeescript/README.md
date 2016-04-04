Prerequisites
-------------

Use the one off coffeescript-setup.sh (assumes brew) OR:

- brew (http://brew.sh/)
- npm (brew install node)
- bower (npm install -g bower)
- grunt-cli (npm install -g grunt-cli)

In each repo, do
----------------

- install dependencies with ``npm install && bower install``
- run the tests with ``grunt test --force``.

The tests will open in your browser and autoreload on changes to files in the scripts directory.