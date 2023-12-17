#include <iostream>

using namespace std;

int main()
{	
	int n, m;

    cin >> n >> m;

    int arr[100] = { 0 };
	
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	int result = 0;

    for (int i = 0; i < n - 2; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                int sum = arr[i] + arr[j] + arr[k];

                if (m == sum) {
                    cout << sum;
                    return 0;
                }

                if (result < sum && sum < m) {
                    result = sum;
                }
            }
        }
    }

    cout << result;

	return 0;
}