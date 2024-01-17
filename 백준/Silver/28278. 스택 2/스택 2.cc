#include <iostream>
#include <stack>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	stack<int> stack;

	int n;
	cin >> n;

	int x;
	while (n-- > 0) {
		cin >> x;
		switch (x)
		{
		case 1: 
			int num;
			cin >> num;
			stack.push(num);
			break;
		case 2: 
			if (stack.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << stack.top() << "\n";
				stack.pop();
			}
			break;
		case 3:
			cout << stack.size() << "\n";
			break;
		case 4:
			if (stack.empty()) {
				cout << 1 << "\n";
			}
			else {
				cout << 0 << "\n";
			}
			break;
		case 5:
			if (stack.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << stack.top() << "\n";
			}
			break;
		}

	}
	return 0;
}