#include <iostream>
#include <stack>
#include <deque>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n, m, x;
	deque<int> dq;

	cin >> n;

	while (n-- > 0) {
		cin >> m;
		switch (m)
		{
		case 1:
			cin >> x;
			dq.push_front(x);
			break;
		case 2:
			cin >> x;
			dq.push_back(x);
			break;
		case 3:
			if (dq.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << dq.front() << "\n";
				dq.pop_front();
			}
			break;
		case 4:
			if (dq.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << dq.back() << "\n";
				dq.pop_back();
			}
			break;
		case 5:
			cout << dq.size() << "\n";
			break;
		case 6:
			if (dq.empty()) {
				cout << 1 << "\n";
			}
			else {
				cout << 0 << "\n";
			}
			break;
		case 7:
			if (dq.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << dq.front() << "\n";
			}
			break;
		case 8:
			if (dq.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << dq.back() << "\n";
			}
			break;
		}
	}

	return 0;
}