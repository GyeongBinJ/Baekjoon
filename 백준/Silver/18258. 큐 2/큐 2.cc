#include <iostream>
#include <queue>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n;
	string str;
	queue<int> q;

	cin >> n;

	while (n-- > 0) {
		cin >> str;

		if (str == "push") {
			int num;
			cin >> num;

			q.push(num);
		}
		else if (str == "pop") {
			if (q.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << q.front() << "\n";
				q.pop();
			}
		}
		else if (str == "size") {
			cout << q.size() << "\n";
		}
		else if (str == "empty") {
			if (q.empty()) {
				cout << 1 << "\n";
			}
			else {
				cout << 0 << "\n";
			}
		}
		else if (str == "front") {
			if (q.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << q.front() << "\n";
			}
		}
		else if (str == "back") {
			if (q.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << q.back() << "\n";
			}
		}
		
	}

	return 0;
}