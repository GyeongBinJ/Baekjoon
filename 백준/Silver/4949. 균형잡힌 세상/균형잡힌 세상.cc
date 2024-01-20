#include <iostream>
#include <stack>
#include <string>

using namespace std;

string result(string str)
{
	stack<char> s;

	for (int i = 0; i < str.length(); i++) {
		if (str[i] == '(' || str[i] == '[') {
			s.push(str[i]);
		}
		else if (str[i] == ')') {
			if (s.empty() || s.top() != '(') {
				return "no";
			}
			else {
				s.pop();
			}
		}
		else if (str[i] == ']') {
			if (s.empty() || s.top() != '[') {
				return "no";
			}
			else {
				s.pop();
			}
		}
	}

	if (s.empty()) {
		return "yes";
	}
	else {
		return "no";
	}
}

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	string str;

	while (1) {
		getline(cin, str);

		if (str.length() == 1 || str[0] == '0')
			break;

		cout << result(str) << "\n";
	}

	return 0;
}